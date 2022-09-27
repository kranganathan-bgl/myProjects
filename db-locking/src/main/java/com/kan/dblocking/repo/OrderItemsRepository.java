package com.kan.dblocking.repo;

import com.kan.dblocking.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface OrderItemsRepository extends JpaRepository<OrderItem, Long> {

  List<OrderItem> findOrderItemsByOrderId(long orderId);

  @Query(value = "select * from OrderItem_Test where id = :id", nativeQuery = true)
  OrderItem findOrderItem(@Param("id") Long id);


  @Modifying
  @Query(value = "update OrderItem_Test set quantity = :quantity, unitPrice = :unitPrice where id = :id", nativeQuery = true)
  void updateOrderItem(@Param("id") Long id, @Param("quantity") Long quantity, @Param("unitPrice") BigDecimal unitPrice);
}
