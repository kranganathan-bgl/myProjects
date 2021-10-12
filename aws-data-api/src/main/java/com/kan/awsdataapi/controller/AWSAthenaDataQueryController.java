package com.kan.awsdataapi.controller;

import com.kan.awsdataapi.dto.JobDTO;
import com.kan.awsdataapi.service.AWSAthenaDataQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aws/athena")
public class AWSAthenaDataQueryController {

    @Autowired
    private AWSAthenaDataQueryService awsAthenaDataQueryService;

    @GetMapping("/{type}/jobno/{jobNoFrom}/{jobNoTo}")
    public List<JobDTO> getJobs(@PathVariable String type, @PathVariable Long jobNoFrom, @PathVariable Long jobNoTo){
        return awsAthenaDataQueryService.getJobs(type, jobNoFrom, jobNoTo);
    }
}
