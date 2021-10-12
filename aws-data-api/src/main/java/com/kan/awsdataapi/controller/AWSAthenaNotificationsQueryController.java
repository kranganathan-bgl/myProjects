package com.kan.awsdataapi.controller;

import com.kan.awsdataapi.dto.NotificationDTO;
import com.kan.awsdataapi.service.AWSAthenaNotificationsQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aws/athena/notifications")
public class AWSAthenaNotificationsQueryController {

  @Autowired
  private AWSAthenaNotificationsQueryService awsAthenaNotificationsQueryService;

  @GetMapping("/{type}/id/{idFrom}/{idTo}")
  public List<NotificationDTO> getNotifications(@PathVariable String type, @PathVariable Long idFrom, @PathVariable Long idTo) {
    return awsAthenaNotificationsQueryService.getNotifications(type, idFrom, idTo);
  }
}
