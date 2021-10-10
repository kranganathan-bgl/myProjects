package com.kan.awsdataapi.service;

import com.kan.awsdataapi.model.Job;
import com.kan.awsdataapi.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> getJobList() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> getJobList(Long jobNoFrom, Long jobNoTo) {
        return jobRepository.findAllByJobNoBetween(jobNoFrom, jobNoTo);
    }

    @Override
    public Job getJob(Long jobNo) {
        return jobRepository.findById(jobNo).orElse(null);
    }

    @Override
    public Job addJob(Job job) {
        job.setDateCrt(LocalDateTime.now());
        return jobRepository.save(job);
    }

    @Override
    public Job updateJob(Long jobNo, Job job) {
        Job jobCurr = getJob(jobNo);
        if(jobCurr == null) {
            return null;
        }

        jobCurr.setJobName(job.getJobName());
        jobCurr.setJobType(job.getJobType());
        jobCurr.setJobStatus(job.getJobStatus());

        return jobRepository.save(jobCurr);
    }

    @Override
    public void deleteJob(Long jobNo) {
        jobRepository.deleteById(jobNo);
    }

    @Override
    public int duplicateJob(Long jobNo, int times) {
        Job job = getJob(jobNo);
        if(job == null){
            return 0;
        }

        List<Job> jobsIn = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            jobsIn.add(Job.builder()
                    .jobName(job.getJobName())
                    .jobType(job.getJobType())
                    .jobStatus(job.getJobStatus())
                    .dateCrt(LocalDateTime.now())
                    .build());
        }

        List<Job> jobsOut = jobRepository.saveAll(jobsIn);
        return jobsOut.size();
    }
}
