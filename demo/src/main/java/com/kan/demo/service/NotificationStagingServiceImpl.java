package com.kan.demo.service;

import com.kan.demo.model.Notification;
import com.kan.demo.model.NotificationStaging;
import com.kan.demo.repo.NotificationStagingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
public class NotificationStagingServiceImpl implements NotificationStagingService {

  @Autowired
  private NotificationStagingRepository notificationStagingRepository;

  @PersistenceContext
  private EntityManager entityManager;

  @Autowired
  private NotificationService notificationService;

  @Autowired
  private TransactionTemplate transactionTemplate;

  @Transactional
  @Override
  public void saveAll(List<NotificationStaging> notificationStagingList) {
    if(notificationStagingList.isEmpty()) {
      return;
    }

    System.out.println("Saving...");

    notificationStagingRepository.saveAll(notificationStagingList);
    detach(notificationStagingList);

    System.out.println("Saved.");
  }

  @Override
  public long transferNotificationsToStaging(long userId) {
    long t1 = System.nanoTime();

    long totalCnt = 0;
    long limit = 1000;
    long offset = 0;

    while (true) {
      List<Notification> notifications = notificationService.getNotifications(userId, limit, offset);
      if(notifications.isEmpty()) {
        break;
      }

      saveAll(toNotificationStagingList(notifications));

      totalCnt += notifications.size();
      offset += limit;

      System.out.println("Cnt: " + totalCnt);
    }

    long t2 = System.nanoTime();
    System.out.println("Total time: " + TimeUnit.SECONDS.convert(t2 - t1, TimeUnit.NANOSECONDS) + " Secs");

    return totalCnt;
  }

  @Override
  public long transferDataFromNotification(long userId) {
    long t1 = System.nanoTime();

    long totalCnt = notificationService.getNotificationCount(userId);
    long limit = 10000;
    long offset = 0;

    while (offset < totalCnt) {
      long finalOffset = offset;
      transactionTemplate.execute(status -> transferDataFromNotification(userId, limit, finalOffset));
      offset += limit;

      System.out.println("Cnt: " + offset);
    }

    long t2 = System.nanoTime();
    System.out.println("Total time: " + TimeUnit.SECONDS.convert(t2 - t1, TimeUnit.NANOSECONDS) + " Secs");

    return totalCnt;
  }

  private long transferDataFromNotification(long userId, long limit, long offset) {
    notificationStagingRepository.transferDataFromNotification(userId, limit, offset);
    return 0;
  }

  private void detach(List<NotificationStaging> notificationStagingList) {
    if(notificationStagingList == null) {
      return;
    }
    notificationStagingList.forEach(notificationStaging -> entityManager.detach(notificationStaging));
  }

  private List<NotificationStaging> toNotificationStagingList(List<Notification> notifications) {
    return notifications.stream().map(this::toNotificationStaging).collect(Collectors.toList());
  }

  private NotificationStaging toNotificationStaging(Notification notification) {
    return NotificationStaging.builder()
                              .id(notification.getId())
                              .version(notification.getVersion())
                              .accountId(notification.getAccountId())
                              .userId(notification.getUserId())
                              .companyId(notification.getCompanyId())
                              .contactId(notification.getContactId())
                              .addressId(notification.getAddressId())
                              .agentId(notification.getAgentId())
                              .title(notification.getTitle())
                              .description(notification.getDescription())
                              .resourcePartialUrl(notification.getResourcePartialUrl())
                              .mediumType(notification.getMediumType())
                              .status(notification.getStatus())
                              .isRead(notification.getIsRead())
                              .creationDate(notification.getCreationDate())
                              .fileId(notification.getFileId())
                              .traceNumber(notification.getTraceNumber())
                              .validationReportId(notification.getValidationReportId())
                              .type(notification.getType())
                              .additionalData1(notification.getAdditionalData1())
                              .additionalData2(notification.getAdditionalData2())
                              .isArchived(notification.getIsArchived())
                              .build();
  }
}
