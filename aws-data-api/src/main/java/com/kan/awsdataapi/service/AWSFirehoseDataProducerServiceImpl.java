package com.kan.awsdataapi.service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest;
import com.amazonaws.services.kinesisfirehose.model.Record;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.kan.awsdataapi.dto.JobDTO;
import com.kan.awsdataapi.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.ByteBuffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AWSFirehoseDataProducerServiceImpl implements AWSFirehoseDataProducerService {

    private static final String TYPE_JSON = "json";
    private static final String TYPE_CSV = "csv";
    private static final String TYPE_PARQUET = "parquet";

    private static final Map<String, String> DELIVERY_STREAM_MAP = Map.of(
            TYPE_JSON, "s3-jobs-json",
            TYPE_CSV, "s3-jobs-csv",
            TYPE_PARQUET, "s3-jobs-parquet"
    );

    @Autowired
    private JobService jobService;

    @Override
    public String putJobs(String type, Long jobNoFrom, Long jobNoTo) {
        List<Record> records = getJobRecords(type, jobNoFrom, jobNoTo);
        if(records.isEmpty()){
            return "No data found";
        }

        AmazonKinesisFirehose firehoseClient = getFirehoseClient();
        PutRecordBatchRequest putRecordBatchRequest = new PutRecordBatchRequest();
        putRecordBatchRequest.setDeliveryStreamName(DELIVERY_STREAM_MAP.get(type));
        putRecordBatchRequest.setRecords(records);
        firehoseClient.putRecordBatch(putRecordBatchRequest);

        return records.size() + " records of data sent";
    }

    private AmazonKinesisFirehose getFirehoseClient() {
        return AmazonKinesisFirehoseClientBuilder.standard().withRegion(Regions.AP_SOUTHEAST_2).build();
    }

    private List<Record> getJobRecords(String type, Long jobNoFrom, Long jobNoTo) {
        List<Job> jobs = jobService.getJobList(jobNoFrom, jobNoTo);

        return jobs
                .stream()
                .map(job -> toJobDtoRecord(type, job))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private Record toJobDtoRecord(String type, Job job) {
        try {
            Record record = new Record();
            return record.withData(ByteBuffer.wrap(toJobDtoBytes(type, job)));
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    private byte[] toJobDtoBytes(String type, Job job) throws JsonProcessingException {
        switch (type){
            case TYPE_JSON:
            case TYPE_PARQUET:
                return toJson(toJobDto(job));
            case TYPE_CSV:
                return toCsv(toJobDto(job));
            default:
                return new byte[0];
        }
    }

    private byte[] toJson(JobDTO jobDTO) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(jobDTO) + "\n";
        return json.getBytes();
    }

    private byte[] toCsv(JobDTO jobDTO) throws JsonProcessingException {
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);

        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(false)
                .addColumn("jobNo")
                .addColumn("jobName")
                .addColumn("jobType")
                .addColumn("jobStatus")
                .addColumn("dateCrt")
                .build();
        ObjectWriter objectWriter = csvMapper.writerFor(JobDTO.class).with(csvSchema);
        String csv = objectWriter.writeValueAsString(jobDTO);
        System.out.print(csv);
        return csv.getBytes();
    }

    private JobDTO toJobDto(Job job) {
        return JobDTO
                .builder()
                .jobNo(job.getJobNo())
                .jobName(job.getJobName())
                .jobType(job.getJobType())
                .jobStatus(job.getJobStatus())
                .dateCrt(toString(job.getDateCrt()))
                .build();
    }

    private String toString(LocalDateTime dateTime) {
        if(dateTime == null) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}
