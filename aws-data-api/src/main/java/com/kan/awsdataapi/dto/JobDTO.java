package com.kan.awsdataapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobDTO {
    private Long jobNo;
    private String jobName;
    private String jobType;
    private String jobStatus;
    private String dateCrt;
}
