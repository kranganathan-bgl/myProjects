package com.kan.awsdataapi.service;

import com.kan.awsdataapi.dto.JobDTO;

import java.util.List;

public interface AWSAthenaDataQueryService {
    List<JobDTO> getJobs(String type, Long jobNoFrom, Long jobNoTo);
}
