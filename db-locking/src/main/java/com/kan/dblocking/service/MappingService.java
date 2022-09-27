package com.kan.dblocking.service;

import com.kan.dblocking.dto.OrderDto;
import com.kan.dblocking.dto.OrderItemDto;
import com.kan.dblocking.entity.Order;
import com.kan.dblocking.entity.OrderItem;

import java.util.List;

public interface MappingService {

  OrderDto toOrderDto(Order order);

  OrderItemDto toOrderItemDto(OrderItem orderItem);

  List<OrderDto> toOrderDtos(List<Order> orders);

  List<OrderItemDto> toOrderItemDtos(List<OrderItem> orderItems);
}
