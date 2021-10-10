package com.kan.awsdataapi.controller;

import com.kan.awsdataapi.service.AWSFirehoseDataProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/firehose")
public class AWSFirehoseDataProducerController {

    @Autowired
    private AWSFirehoseDataProducerService awsFirehoseDataProducerService;

    @GetMapping("/{type}/{jobNoFrom}/{jobNoTo}")
    public String sendData(@PathVariable String type, @PathVariable Long jobNoFrom, @PathVariable Long jobNoTo) {
        return awsFirehoseDataProducerService.putJobs(type, jobNoFrom, jobNoTo);
    }
}

