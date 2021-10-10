package com.kan.awsdataapi.repo;

import com.kan.awsdataapi.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findAllByJobNoBetween(Long start, Long end);
}
