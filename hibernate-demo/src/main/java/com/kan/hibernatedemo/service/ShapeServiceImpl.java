package com.kan.hibernatedemo.service;

import com.kan.hibernatedemo.entity.Circle;
import com.kan.hibernatedemo.entity.Rectangle;
import com.kan.hibernatedemo.repo.CircleRepositoty;
import com.kan.hibernatedemo.repo.RectangleRepository;
import com.kan.hibernatedemo.repo.ShapeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShapeServiceImpl implements ShapeService {

  private final ShapeRepository shapeRepository;
  private final CircleRepositoty circleRepositoty;
  private final RectangleRepository rectangleRepository;

  public ShapeServiceImpl(ShapeRepository shapeRepository, CircleRepositoty circleRepositoty, RectangleRepository rectangleRepository) {
    this.shapeRepository = shapeRepository;
    this.circleRepositoty = circleRepositoty;
    this.rectangleRepository = rectangleRepository;
  }

  @Transactional
  @Override
  public void persistData() {
    System.out.println("");
    System.out.println("persistData");
    System.out.println("");

    persistCircle();
    persistRectangle();

//    updateCircle(1L);
//    deleteCircle(1L);
  }

  @Override
  public void fetchData() {
    System.out.println("");
    System.out.println("fetchData");
    System.out.println("");

//    System.out.println("shapeRepository.findAll()");
//    System.out.println(shapeRepository.findAll());
//    System.out.println("");

    System.out.println("shapeRepository.findById(1L)");
    System.out.println(shapeRepository.findById(1L));
    System.out.println("");

    System.out.println("circleRepositoty.findById(1L)");
    System.out.println(circleRepositoty.findById(1L));
    System.out.println("");

    System.out.println("rectangleRepository.findById(1L)");
    System.out.println(rectangleRepository.findById(1L));
  }

  private void persistCircle() {
    Circle circle = new Circle();
    circle.setCentreX(15);
    circle.setCentreY(15);
    circle.setRadius(10);

    circleRepositoty.save(circle);
  }

  private void persistRectangle() {
    Rectangle rectangle = new Rectangle();
    rectangle.setCentreX(45);
    rectangle.setCentreY(15);
    rectangle.setWidth(30);
    rectangle.setHeight(20);

    rectangleRepository.save(rectangle);
  }

  private void deleteCircle(Long id) {
    circleRepositoty.deleteById(1L);
  }

  private void updateCircle(long id) {
    Circle circle = circleRepositoty.findById(id).orElse(null);
    circle.setCentreY(20);
//    circle.setRadius(5);

    circleRepositoty.save(circle);
  }
}
