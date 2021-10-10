package com.kan.awsdataapi.service;

import com.kan.awsdataapi.model.Job;

import java.util.List;

public interface JobService {

    List<Job> getJobList();

    List<Job> getJobList(Long jobNoFrom, Long jobNoTo);

    Job getJob(Long jobNo);

    Job addJob(Job job);

    Job updateJob(Long jobNo, Job job);

    void deleteJob(Long jobNo);

    int duplicateJob(Long jobNo, int times);
}