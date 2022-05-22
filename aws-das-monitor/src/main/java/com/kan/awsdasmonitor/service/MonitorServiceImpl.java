package com.kan.awsdasmonitor.service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.InitialPositionInStream;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.KinesisClientLibConfiguration;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.Worker;
import com.amazonaws.services.kinesis.clientlibrary.lib.worker.Worker.Builder;
import com.kan.awsdasmonitor.factory.RecordProcessorFactory;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

@Service
public class MonitorServiceImpl implements MonitorService {

    private static final String STREAM_NAME = "aws-rds-das-cluster-MBZRMBMMCEG65AFZTU464GHKRI"; //"aws-rds-das-[cluster-external-resource-id]";
    private static final String APPLICATION_NAME = "AwsDasMonitorApplication2"; //unique application name for dynamo table generation that holds kinesis shard tracking
    private static final String AWS_ACCESS_KEY = "";
    private static final String AWS_SECRET_KEY = "";

    private static final String REGION_NAME = Regions.AP_SOUTHEAST_2.getName(); //us-east-1, us-east-2...
    private static final BasicAWSCredentials CREDENTIALS = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY);
    private static final AWSStaticCredentialsProvider CREDENTIALS_PROVIDER = new AWSStaticCredentialsProvider(CREDENTIALS);

    //    private static final AwsCrypto CRYPTO = new AwsCrypto();

    @Override
    public void monitor() {
        String workerId;
        try {
            workerId = InetAddress.getLocalHost().getCanonicalHostName() + ":" + UUID.randomUUID();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        final KinesisClientLibConfiguration kinesisClientLibConfiguration =
                new KinesisClientLibConfiguration(APPLICATION_NAME, STREAM_NAME, CREDENTIALS_PROVIDER, workerId);
        kinesisClientLibConfiguration.withInitialPositionInStream(InitialPositionInStream.LATEST);
        kinesisClientLibConfiguration.withRegionName(REGION_NAME);
        final Worker worker = new Builder()
                .recordProcessorFactory(new RecordProcessorFactory())
                .config(kinesisClientLibConfiguration)
                .build();

        System.out.printf("Running %s to process stream %s as worker %s...\n", APPLICATION_NAME, STREAM_NAME, workerId);

        try {
            worker.run();
        } catch (Throwable t) {
            System.err.println("Caught throwable while processing data.");
            t.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }
}

