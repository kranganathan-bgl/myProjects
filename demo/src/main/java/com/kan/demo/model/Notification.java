package com.kan.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notification {
  @Id
  private Long id;
  private Long version;
  private Long accountId;
  private Long userId;
  private String  companyId;
  private Long contactId;
  private Integer addressId;
  private Long agentId;
  private String title;
  private String description;
  private String resourcePartialUrl;
  private String mediumType;
  private String status;
  private Boolean isRead;
  private LocalDateTime creationDate;
  private Long fileId;
  private String traceNumber;
  private Boolean validationReportId;
  private String type;
  private String additionalData1;
  private String additionalData2;
  private Boolean isArchived;
}
