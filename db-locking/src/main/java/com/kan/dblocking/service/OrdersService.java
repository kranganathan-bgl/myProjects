package com.kan.dblocking.service;

import com.kan.dblocking.entity.Order;

import java.util.List;

public interface OrdersService {

  List<Order> getOrders();

  Order getOrder(long id);

  Order getOrderLazyLoadingTest(long id);

  Order addOrder(Order order);

  Order updateOrder(long id, Order order);

  void deleteOrder(Long id);
}
