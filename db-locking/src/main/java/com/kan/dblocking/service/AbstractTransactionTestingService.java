package com.kan.dblocking.service;

import com.kan.dblocking.entity.Order;
import com.kan.dblocking.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


 @Transactional
public abstract class AbstractTransactionTestingService {

  private final OrdersRepository ordersRepository;

  @Autowired
  protected AbstractTransactionTestingService(OrdersRepository ordersRepository) {
    this.ordersRepository = ordersRepository;
  }

  abstract Order updateOrder1(long id, Order order);

  public Order updateOrder2(long id, Order order) {
    Order orderExisting = getOrder(id);
    orderExisting.setCustomerName(order.getCustomerName());
    Order orderSaved = ordersRepository.save(orderExisting);
    return orderSaved;
  }

  protected Order getOrder(long id) {
    return ordersRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with id: %s not found".formatted(id)));
  }
}
