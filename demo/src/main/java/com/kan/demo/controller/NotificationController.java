package com.kan.demo.controller;

import com.kan.demo.service.NotificationDateService;
import com.kan.demo.service.NotificationService;
import com.kan.demo.service.NotificationStagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

  @Autowired
  private NotificationService notificationService;

  @Autowired
  private NotificationStagingService notificationStagingService;

  @Autowired
  private NotificationDateService notificationDateService;

  @GetMapping("/{userId}/{limit}")
  public long retieveNotifications(@PathVariable long userId, @PathVariable long limit) {
//    return notificationService.retieveNotifications(userId, limit);
//    return notificationService.retieveNotificationsUsingStream(userId);
//    return notificationStagingService.transferNotificationsToStaging(userId);
//    return notificationStagingService.transferDataFromNotification(userId);
    return notificationDateService.transferDataFromNotification(userId);
  }
}
