package com.kan.hibernatedemo.repo;

import com.kan.hibernatedemo.entity.Rectangle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RectangleRepository extends JpaRepository<Rectangle, Long> {
}
