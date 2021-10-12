package com.kan.awsdataapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationDTO {
  private Long id;
  private Long accountId;
  private Long userId;
  private String companyId;
  private String title;
  private String description;
  private String creationDate;
}
