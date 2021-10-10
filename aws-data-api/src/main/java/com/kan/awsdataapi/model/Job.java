package com.kan.awsdataapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobNo;
    private String jobName;
    private String jobDesc;
    private String jobType;
    private String jobPriority;
    private String jobStatus;
    private String jobResolution;
    private String jobStage;
    private String jobRef;
    private Integer jobOrder;
    private String assignedTo;
    private String timesheetCode;
    private Double estimatedHrs;
    private Double completedHrs;
    private LocalDate estimatedStartDate;
    private LocalDate actualStartDate;
    private LocalDate estimatedEndDate;
    private LocalDate actualEndDate;
    private Long parentJobNo;
    private Boolean active;
    private LocalDateTime dateCrt;
    private String userCrt;
    private LocalDateTime dateMod;
    private String userMod;
}
