package com.kan.hibernatedemo.repo;

import com.kan.hibernatedemo.entity.Shape;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShapeRepository extends JpaRepository<Shape, Long> {
}
