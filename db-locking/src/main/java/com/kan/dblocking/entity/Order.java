package com.kan.dblocking.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Order_Test")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String customerName;

  @Column(insertable = false, updatable = false)
  private LocalDateTime orderDate;

  @Version
  private Long version;

//  @OneToMany(fetch = FetchType.LAZY)
//  @JoinColumn(name = "orderId")
  @OneToMany(mappedBy = "orderId", fetch = FetchType.LAZY)
  @Fetch(FetchMode.SUBSELECT)
  private List<OrderItem> orderItems;
}
