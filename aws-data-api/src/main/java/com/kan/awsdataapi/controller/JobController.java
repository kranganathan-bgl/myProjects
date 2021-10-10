package com.kan.awsdataapi.controller;

import com.kan.awsdataapi.model.Job;
import com.kan.awsdataapi.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getJobList(){
        return jobService.getJobList();
    }

    @GetMapping("/{jobNoFrom}/{jobNoTo}")
    public List<Job> getJobListByJobNoBetween(@PathVariable Long jobNoFrom, @PathVariable Long jobNoTo){
        return jobService.getJobList(jobNoFrom, jobNoTo);
    }

    @GetMapping("/{jobNo}")
    public Job getJob(@PathVariable Long jobNo){
        return jobService.getJob(jobNo);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @PutMapping("/{jobNo}")
    public Job updateJob(@PathVariable Long jobNo, @RequestBody Job job) {
        return jobService.updateJob(jobNo, job);
    }

    @DeleteMapping("/{jobNo}")
    public void deleteJob(@PathVariable Long jobNo) {
        jobService.deleteJob(jobNo);
    }

    @PostMapping("/{jobNo}/{times}")
    @ResponseStatus(HttpStatus.CREATED)
    public int duplicateJob(@PathVariable Long jobNo, @PathVariable int times) {
        return jobService.duplicateJob(jobNo, times);
    }
}
