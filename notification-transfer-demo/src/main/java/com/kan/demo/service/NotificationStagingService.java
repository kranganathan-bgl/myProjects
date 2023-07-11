package com.kan.demo.service;

import com.kan.demo.model.NotificationStaging;

import java.util.List;

public interface NotificationStagingService {

  void saveAll(List<NotificationStaging> notificationStagingList);

  long transferNotificationsToStaging(long userId);

  long transferDataFromNotification(long userId);
}
