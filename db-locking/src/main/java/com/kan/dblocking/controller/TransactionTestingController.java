package com.kan.dblocking.controller;

import com.kan.dblocking.dto.OrderDto;
import com.kan.dblocking.dto.OrderItemDto;
import com.kan.dblocking.entity.Order;
import com.kan.dblocking.entity.OrderItem;
import com.kan.dblocking.service.AbstractTransactionTestingService;
import com.kan.dblocking.service.MappingService;
import com.kan.dblocking.service.TransactionTestingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class TransactionTestingController {

  private final TransactionTestingServiceImpl transactionTestingService;
  private final MappingService mappingService;

  @Autowired
  public TransactionTestingController(TransactionTestingServiceImpl transactionTestingService, MappingService mappingService) {
    this.transactionTestingService = transactionTestingService;
    this.mappingService = mappingService;
  }

  @PutMapping("/update-1/{id}")
  public OrderDto updateOrder1(@PathVariable long id, @RequestBody Order order) {
    return mappingService.toOrderDto(transactionTestingService.updateOrder1(id, order));
  }

  @PutMapping("/update-2/{id}")
  public OrderDto updateOrder2(@PathVariable long id, @RequestBody Order order) {
    return mappingService.toOrderDto(transactionTestingService.updateOrder2(id, order));
  }

  @PutMapping("/orderItem/{id}")
  public OrderItemDto updateOrderItem(@PathVariable long id, @RequestBody OrderItem orderItem) {
    return mappingService.toOrderItemDto(transactionTestingService.updateOrderItem(id, orderItem));
  }
}
