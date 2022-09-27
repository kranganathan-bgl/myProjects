package com.kan.dblocking.controller;

import com.kan.dblocking.dto.OrderDto;
import com.kan.dblocking.entity.Order;
import com.kan.dblocking.service.MappingService;
import com.kan.dblocking.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

  private final OrdersService ordersService;
  private final MappingService mappingService;

  @Autowired
  public OrdersController(OrdersService ordersService, MappingService mappingService) {
    this.ordersService = ordersService;
    this.mappingService = mappingService;
  }

  @GetMapping("")
  public List<OrderDto> getOrders() {
    return mappingService.toOrderDtos(ordersService.getOrders());
  }

  @GetMapping("/{id}")
  public OrderDto getOrder(@PathVariable long id) {
    return mappingService.toOrderDto(ordersService.getOrder(id));
  }

  @GetMapping("/{id}/lazyLoadingTest")
  public OrderDto getOrderL(@PathVariable long id) {
    return mappingService.toOrderDto(ordersService.getOrderLazyLoadingTest(id));
  }

  @PostMapping("")
  public OrderDto addOrder(@RequestBody Order order) {
    return mappingService.toOrderDto(ordersService.addOrder(order));
  }

  @PutMapping("/{id}")
  public OrderDto updateOrder(@PathVariable long id, @RequestBody Order order) {
    return mappingService.toOrderDto(ordersService.updateOrder(id, order));
  }

  @DeleteMapping("/{id}")
  public String deleteOrder(@PathVariable long id) {
    ordersService.deleteOrder(id);
    return "deleted order: %s".formatted(id);
  }
}
