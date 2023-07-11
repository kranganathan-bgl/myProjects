package com.kan.hibernatedemo;

import com.kan.hibernatedemo.service.ShapeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateDemoApplication implements CommandLineRunner {

  private final ShapeService shapeService;

  public HibernateDemoApplication(ShapeService shapeService) {
    this.shapeService = shapeService;
  }

  public static void main(String[] args) {
    SpringApplication.run(HibernateDemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    shapeService.persistData();
    shapeService.fetchData();
  }
}
