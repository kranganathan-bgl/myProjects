package com.kan.dblocking.service;

import com.kan.dblocking.entity.OrderItem;
import com.kan.dblocking.repo.OrderItemsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class OrderItemsServiceImpl implements OrderItemsService {

  private final OrderItemsRepository orderItemsRepository;
  private final CommonService commonService;

  @Autowired
  public OrderItemsServiceImpl(OrderItemsRepository orderItemsRepository, CommonService commonService) {
    this.orderItemsRepository = orderItemsRepository;
    this.commonService = commonService;
  }

  @Override
  public List<OrderItem> getOrderItems() {
    return orderItemsRepository.findAll();
  }

  @Override
  public List<OrderItem> getOrderItemsByOrderId(Long orderId) {
    commonService.logTransactionIsolationLevel();
    return orderItemsRepository.findOrderItemsByOrderId(orderId);
  }

  @Transactional
  @Override
  public OrderItem getOrderItem(Long id) {
    commonService.logTransactionIsolationLevel();
//    OrderItem orderItem = findOrderItem(id);
    return findOrderItem(id);
  }

  @Override
  public OrderItem addOrderItem(OrderItem orderItem) {
    commonService.logTransactionIsolationLevel();
    return orderItemsRepository.save(orderItem);
  }

  @Transactional
  @Override
  public OrderItem updateOrderItem(long id, OrderItem orderItem) {
    commonService.logTransactionIsolationLevel();

    OrderItem orderItemExisting = findOrderItem(id);
    orderItemExisting.setQuantity(orderItemExisting.getQuantity() + orderItem.getQuantity());
    orderItemExisting.setUnitPrice(orderItem.getUnitPrice());

    OrderItem orderSaved = orderItemsRepository.save(orderItemExisting);

    return orderSaved;
  }

  @Override
  public void deleteOrderItem(Long id) {
    commonService.logTransactionIsolationLevel();
    orderItemsRepository.deleteById(id);
  }

  private OrderItem findOrderItem(Long id) {
    return orderItemsRepository.findById(id).orElseThrow(() -> new RuntimeException("Order Item with id: %s not found".formatted(id)));
  }
}
