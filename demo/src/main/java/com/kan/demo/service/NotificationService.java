package com.kan.demo.service;

import com.kan.demo.model.Notification;

import java.util.List;

public interface NotificationService {

  long retieveNotifications(long userId, long limit);

  long retieveNotificationsUsingStream(long userId);

  List<Notification> getNotifications(long userId, long limit, long offset);

  long getNotificationCount(long userId);
}
