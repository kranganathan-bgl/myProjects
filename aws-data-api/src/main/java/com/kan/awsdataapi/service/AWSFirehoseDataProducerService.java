package com.kan.awsdataapi.service;

public interface AWSFirehoseDataProducerService {
    String putJobs(String type, Long jobNoFrom, Long jobNoTo);
}
