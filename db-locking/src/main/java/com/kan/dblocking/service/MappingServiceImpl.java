package com.kan.dblocking.service;

import com.kan.dblocking.dto.OrderDto;
import com.kan.dblocking.dto.OrderItemDto;
import com.kan.dblocking.entity.Order;
import com.kan.dblocking.entity.OrderItem;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class MappingServiceImpl implements MappingService {

  @Override
  public OrderDto toOrderDto(Order order) {
    if (ObjectUtils.isEmpty(order)) {
      return OrderDto.builder().build();
    }
    return OrderDto.builder()
                   .id(order.getId())
                   .customerName(order.getCustomerName())
                   .orderDate(order.getOrderDate())
                   .version(order.getVersion())
                   .orderItems(toOrderItemDtos(order.getOrderItems()))
                   .build();
  }

  @Override
  public OrderItemDto toOrderItemDto(OrderItem orderItem) {
    if (ObjectUtils.isEmpty(orderItem)) {
      return OrderItemDto.builder().build();
    }
    return OrderItemDto.builder()
                       .id(orderItem.getId())
                       .orderId(orderItem.getOrderId())
                       .itemName(orderItem.getItemName())
                       .quantity(orderItem.getQuantity())
                       .unitPrice(orderItem.getUnitPrice())
                       .version(orderItem.getVersion())
                       .build();
  }

  @Override
  public List<OrderDto> toOrderDtos(List<Order> orders) {
    if (CollectionUtils.isEmpty(orders)) {
      return List.of();
    }
    return orders.stream().map(this::toOrderDto).toList();
  }

  @Override
  public List<OrderItemDto> toOrderItemDtos(List<OrderItem> orderItems) {
    if (CollectionUtils.isEmpty(orderItems)) {
      return List.of();
    }
    return orderItems.stream().map(this::toOrderItemDto).toList();
  }
}
