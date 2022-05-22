package com.kan.awsdasmonitor.factory;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.encryptionsdk.AwsCrypto;
import com.amazonaws.encryptionsdk.CryptoInputStream;
import com.amazonaws.encryptionsdk.jce.JceMasterKey;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.clientlibrary.exceptions.InvalidStateException;
import com.amazonaws.services.kinesis.clientlibrary.exceptions.ShutdownException;
import com.amazonaws.services.kinesis.clientlibrary.exceptions.ThrottlingException;
import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessor;
import com.amazonaws.services.kinesis.clientlibrary.interfaces.IRecordProcessorCheckpointer;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.ShutdownReason;
import com.amazonaws.services.kinesis.model.Record;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.DecryptResult;
import com.amazonaws.util.Base64;
import com.amazonaws.util.IOUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kan.awsdasmonitor.model.Activity;
import com.kan.awsdasmonitor.model.ActivityEvent;
import com.kan.awsdasmonitor.model.ActivityRecords;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class RecordProcessor implements IRecordProcessor {

    private static final long BACKOFF_TIME_IN_MILLIS = 3000L;
    private static final int PROCESSING_RETRIES_MAX = 10;
    private static final long CHECKPOINT_INTERVAL_MILLIS = 60000L;
    private static final Gson GSON = new GsonBuilder().serializeNulls().create();
    private static final String DBC_RESOURCE_ID = "cluster-MBZRMBMMCEG65AFZTU464GHKRI";
    private static final String REGION_NAME = Regions.AP_SOUTHEAST_2.getName(); //us-east-1, us-east-2...
    private static final String AWS_ACCESS_KEY = "";
    private static final String AWS_SECRET_KEY = "";
    private static final BasicAWSCredentials CREDENTIALS = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY);
    private static final AWSStaticCredentialsProvider CREDENTIALS_PROVIDER = new AWSStaticCredentialsProvider(CREDENTIALS);

    private static final AWSKMS KMS = AWSKMSClientBuilder.standard()
            .withRegion(REGION_NAME)
            .withCredentials(CREDENTIALS_PROVIDER).build();

    private static final AwsCrypto CRYPTO = new AwsCrypto();

    private static final Cipher CIPHER;

    static {
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
        try {
            CIPHER = Cipher.getInstance("AES/GCM/NoPadding", "BC");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private long nextCheckpointTimeInMillis;

    @Override
    public void initialize(String shardId) {
    }

    @Override
    public void processRecords(final List<Record> records, final IRecordProcessorCheckpointer checkpointer) {
        for (final Record record : records) {
            processSingleBlob(record.getData());
        }

        if (System.currentTimeMillis() > nextCheckpointTimeInMillis) {
            checkpoint(checkpointer);
            nextCheckpointTimeInMillis = System.currentTimeMillis() + CHECKPOINT_INTERVAL_MILLIS;
        }
    }

    @Override
    public void shutdown(IRecordProcessorCheckpointer checkpointer, ShutdownReason reason) {
        if (reason == ShutdownReason.TERMINATE) {
            checkpoint(checkpointer);
        }
    }

    private void processSingleBlob(final ByteBuffer bytes) {
        try {
            // JSON $Activity
            final Activity activity = GSON.fromJson(new String(bytes.array(), StandardCharsets.UTF_8), Activity.class);

            // Base64.Decode
            final byte[] decoded = Base64.decode(activity.getDatabaseActivityEvents());
            final byte[] decodedDataKey = Base64.decode(activity.getKey());

            Map<String, String> context = new HashMap<>();
            context.put("aws:rds:dbc-id", DBC_RESOURCE_ID);

            // Decrypt
            final DecryptRequest decryptRequest = new DecryptRequest()
                    .withCiphertextBlob(ByteBuffer.wrap(decodedDataKey)).withEncryptionContext(context);
            final DecryptResult decryptResult = KMS.decrypt(decryptRequest);
            final byte[] decrypted = decrypt(decoded, getByteArray(decryptResult.getPlaintext()));

            // GZip Decompress
            final byte[] decompressed = decompress(decrypted);
            // JSON $ActivityRecords
            final ActivityRecords activityRecords = GSON.fromJson(new String(decompressed, StandardCharsets.UTF_8), ActivityRecords.class);

            // Iterate throught $ActivityEvents
            for (final ActivityEvent event : activityRecords.getDatabaseActivityEventList()) {
                if (event.getCommandText() != null && event.getCommandText().contains("job_stage")) {
                    System.out.println(GSON.toJson(event));
                }
            }
        } catch (Exception e) {
            // Handle error.
            e.printStackTrace();
        }
    }

    private static byte[] decompress(final byte[] src) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(src);
        GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);
        return IOUtils.toByteArray(gzipInputStream);
    }

    private static byte[] decrypt(final byte[] decoded, final byte[] decodedDataKey) throws IOException {
        // Create a JCE master key provider using the random key and an AES-GCM encryption algorithm
        final JceMasterKey masterKey = JceMasterKey.getInstance(new SecretKeySpec(decodedDataKey, "AES"),
                "BC", "DataKey", "AES/GCM/NoPadding");
        try (final CryptoInputStream<JceMasterKey> decryptingStream = CRYPTO.createDecryptingStream(masterKey, new ByteArrayInputStream(decoded));
             final ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            IOUtils.copy(decryptingStream, out);
            return out.toByteArray();
        }
    }

    private static byte[] getByteArray(final ByteBuffer b) {
        byte[] byteArray = new byte[b.remaining()];
        b.get(byteArray);
        return byteArray;
    }

    private void checkpoint(IRecordProcessorCheckpointer checkpointer) {
        for (int i = 0; i < PROCESSING_RETRIES_MAX; i++) {
            try {
                checkpointer.checkpoint();
                break;
            } catch (ShutdownException se) {
                // Ignore checkpoint if the processor instance has been shutdown (fail over).
                System.out.println("Caught shutdown exception, skipping checkpoint." + se);
                break;
            } catch (ThrottlingException e) {
                // Backoff and re-attempt checkpoint upon transient failures
                if (i >= (PROCESSING_RETRIES_MAX - 1)) {
                    System.out.println("Checkpoint failed after " + (i + 1) + "attempts." + e);
                    break;
                } else {
                    System.out.println("Transient issue when checkpointing - attempt " + (i + 1) + " of " + PROCESSING_RETRIES_MAX + e);
                }
            } catch (InvalidStateException e) {
                // This indicates an issue with the DynamoDB table (check for table, provisioned IOPS).
                System.out.println("Cannot save checkpoint to the DynamoDB table used by the Amazon Kinesis Client Library." + e);
                break;
            }
            try {
                Thread.sleep(BACKOFF_TIME_IN_MILLIS);
            } catch (InterruptedException e) {
                System.out.println("Interrupted sleep" + e);
            }
        }
    }
}
