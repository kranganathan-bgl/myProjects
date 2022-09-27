package com.kan.dblocking.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "OrderItem_Test")
public class OrderItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long orderId;
  private String itemName;
  private Long quantity;
  private BigDecimal unitPrice;

  @Version
  private Long version;
}
