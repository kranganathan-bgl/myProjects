package com.kan.dblocking.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
public class OrderItemDto implements Serializable {
  @Serial
  private static final long serialVersionUID = -1123481594371143937L;

  private Long id;
  private Long orderId;
  private String itemName;
  private Long quantity;
  private BigDecimal unitPrice;
  private Long version;
}
