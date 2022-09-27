package com.kan.dblocking.service;

import com.kan.dblocking.entity.OrderItem;

import java.util.List;

public interface OrderItemsService {

  List<OrderItem> getOrderItems();

  List<OrderItem> getOrderItemsByOrderId(Long orderId);

  OrderItem getOrderItem(Long id);

  OrderItem addOrderItem(OrderItem orderItem);

  OrderItem updateOrderItem(long id, OrderItem orderItem);

  void deleteOrderItem(Long id);
}
