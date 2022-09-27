package com.kan.dblocking.service;

import com.kan.dblocking.entity.Order;
import com.kan.dblocking.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

  private static Order order = null;

  private final OrdersRepository ordersRepository;
  private final OrderItemsService orderItemsService;
  private final CommonService commonService;

  @Autowired
  public OrdersServiceImpl(OrdersRepository ordersRepository, OrderItemsService orderItemsService, CommonService commonService) {
    this.ordersRepository = ordersRepository;
    this.orderItemsService = orderItemsService;
    this.commonService = commonService;
  }

  @Override
  public List<Order> getOrders() {
    commonService.logTransactionIsolationLevel();
    return ordersRepository.findAll();
  }

  @Transactional
  @Override
  public Order getOrder(long id) {
    commonService.logTransactionIsolationLevel();
    return ordersRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with id: %s not found".formatted(id)));
  }

  @Transactional
  @Override
  public Order getOrderLazyLoadingTest(long id) {
    commonService.logTransactionIsolationLevel();
    if(order == null) {
      order = ordersRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with id: %s not found".formatted(id)));
      return new Order();
    }
    order.setOrderItems(orderItemsService.getOrderItemsByOrderId(order.getId()));
    return order;
  }

  @Override
  public Order addOrder(Order order) {
    commonService.logTransactionIsolationLevel();
    return ordersRepository.save(order);
  }

  @Transactional
  @Override
  public Order updateOrder(long id, Order order) {
    commonService.logTransactionIsolationLevel();
    Order orderExisting = getOrder(id);
    orderExisting.setCustomerName(order.getCustomerName());
    return ordersRepository.save(orderExisting);
  }

  @Override
  public void deleteOrder(Long id) {
    commonService.logTransactionIsolationLevel();
    ordersRepository.deleteById(id);
  }
}
