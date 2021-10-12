package com.kan.awsdataapi.service;

import com.kan.awsdataapi.dto.NotificationDTO;

import java.util.List;

public interface AWSAthenaNotificationsQueryService {
  List<NotificationDTO> getNotifications(String type, Long idFrom, Long idTo);
}
