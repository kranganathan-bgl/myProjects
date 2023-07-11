package com.kan.hibernatedemo.repo;

import com.kan.hibernatedemo.entity.Circle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CircleRepositoty extends JpaRepository<Circle, Long> {
}
