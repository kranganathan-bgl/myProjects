package com.kan.dblocking.controller;

import com.kan.dblocking.dto.OrderItemDto;
import com.kan.dblocking.entity.OrderItem;
import com.kan.dblocking.service.MappingService;
import com.kan.dblocking.service.OrderItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderItems")
public class OrderItemsController {

  private final OrderItemsService orderItemsService;
  private final MappingService mappingService;

  @Autowired
  public OrderItemsController(OrderItemsService orderItemsService, MappingService mappingService) {
    this.orderItemsService = orderItemsService;
    this.mappingService = mappingService;
  }

  @GetMapping("")
  public List<OrderItemDto> getOrderItems() {
    return mappingService.toOrderItemDtos(orderItemsService.getOrderItems());
  }

  @GetMapping("/{id}")
  public OrderItemDto getOrderItem(@PathVariable long id) {
    return mappingService.toOrderItemDto(orderItemsService.getOrderItem(id));
  }

  @PostMapping("")
  public OrderItemDto addOrderItem(@RequestBody OrderItem orderItem) {
    return mappingService.toOrderItemDto(orderItemsService.addOrderItem(orderItem));
  }

  @PutMapping("/{id}")
  public OrderItemDto updateOrderItem(@PathVariable long id, @RequestBody OrderItem orderItem) {
    return mappingService.toOrderItemDto(orderItemsService.updateOrderItem(id, orderItem));
  }

  @DeleteMapping("/{id}")
  public String deleteOrderItem(@PathVariable long id) {
    orderItemsService.deleteOrderItem(id);
    return "deleted order item: %s".formatted(id);
  }
}
