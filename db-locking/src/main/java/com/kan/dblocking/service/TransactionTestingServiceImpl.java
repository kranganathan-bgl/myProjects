package com.kan.dblocking.service;

import com.kan.dblocking.entity.Order;
import com.kan.dblocking.entity.OrderItem;
import com.kan.dblocking.repo.OrderItemsRepository;
import com.kan.dblocking.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//@Transactional
@Service
public class TransactionTestingServiceImpl extends AbstractTransactionTestingService {

  private final OrdersRepository ordersRepository;
  private final OrderItemsRepository orderItemsRepository;

  @Autowired
  protected TransactionTestingServiceImpl(OrdersRepository ordersRepository, OrderItemsRepository orderItemsRepository) {
    super(ordersRepository);
    this.ordersRepository = ordersRepository;
    this.orderItemsRepository = orderItemsRepository;
  }

//  @Transactional
  @Override
  public Order updateOrder1(long id, Order order) {
    Order orderExisting = getOrder(id);
    orderExisting.setCustomerName(order.getCustomerName());
    Order orderSaved = ordersRepository.save(orderExisting);
//    Order orderSaved =  super.updateOrder2(id, order);
    return orderSaved;
  }

  public OrderItem updateOrderItem(long id, OrderItem orderItem) {
    OrderItem orderItemExisting = findOrderItem(id);
    orderItemExisting.setQuantity(orderItemExisting.getQuantity() + orderItem.getQuantity());
    orderItemExisting.setUnitPrice(orderItem.getUnitPrice());

    OrderItem orderSaved = orderItemsRepository.save(orderItemExisting);

    return orderSaved;
  }

  private OrderItem findOrderItem(Long id) {
    return orderItemsRepository.findById(id).orElseThrow(() -> new RuntimeException("Order Item with id: %s not found".formatted(id)));
  }
}
