package com.kan.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class NotificationDate {
  @Id
  private Long id;
  private Long userId;
  private LocalDateTime creationDate;
  private Boolean isArchived;
}
