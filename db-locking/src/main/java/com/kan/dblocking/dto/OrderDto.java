package com.kan.dblocking.dto;

import com.kan.dblocking.entity.OrderItem;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Builder
public class OrderDto implements Serializable {
  @Serial
  private static final long serialVersionUID = -8174032286101544962L;

  private Long id;
  private String customerName;
  private LocalDateTime orderDate;
  private Long version;
  private List<OrderItemDto> orderItems;
}
