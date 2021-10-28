package com.kan.demo.service;

import com.kan.demo.repo.NotificationDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationDateServiceImpl implements NotificationDateService {

  @Autowired
  private NotificationDateRepository notificationDateRepository;

  @Autowired
  private NotificationService notificationService;

  @Autowired
  TransactionTemplate transactionTemplate;

  @Override
  public long transferDataFromNotification(long userId) {
    long t1 = System.nanoTime();

    long totalCnt = notificationService.getNotificationCount(userId);
    long limit = 5000;
    long offset = 0;

    while (offset < totalCnt) {
      long finalOffset = offset;
      transactionTemplate.execute(status -> transferDataFromNotification(userId, limit, finalOffset));
      offset += limit;

//      System.out.println("Cnt: " + offset);
    }

    long t2 = System.nanoTime();
    System.out.println("Total time: " + TimeUnit.SECONDS.convert(t2 - t1, TimeUnit.NANOSECONDS) + " Secs");

    return totalCnt;
  }

  private long transferDataFromNotification(long userId, long limit, long offset) {
    notificationDateRepository.transferDataFromNotification(userId, limit, offset);
    return 0;
  }
}
