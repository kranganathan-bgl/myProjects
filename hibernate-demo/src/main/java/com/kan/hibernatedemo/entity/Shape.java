package com.kan.hibernatedemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Shape {
  @Id
//  for TABLE_PER_CLASS
//  @GeneratedValue(strategy = GenerationType.AUTO)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

//  @Enumerated(EnumType.STRING)
//  @Column(nullable = false, insertable = false, updatable = false)
//  private ShapeType type;

  private int centreX;
  private int centreY;
}
