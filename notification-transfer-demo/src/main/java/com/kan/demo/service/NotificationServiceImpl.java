package com.kan.demo.service;

import com.kan.demo.model.Notification;
import com.kan.demo.repo.NotificationRepository;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class NotificationServiceImpl implements NotificationService {

  @Autowired
  private NotificationRepository notificationRepository;

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public long retieveNotifications(long userId, long limit) {
    long t1 = System.nanoTime();

    long totalCnt = 0;
    long offset = 0;

    while (true) {
      long cnt = getNotifications(userId, limit, offset, entityManager);
      if(cnt == 0) {
        break;
      }

      totalCnt += cnt;
      offset += limit;

      System.out.println("Cnt: " + totalCnt);
    }

    long t2 = System.nanoTime();
    System.out.println("Total time: " + TimeUnit.SECONDS.convert(t2 - t1, TimeUnit.NANOSECONDS) + " Secs");

    return totalCnt;
  }

  private long getNotifications(long userId, long limit, long offset, EntityManager entityManager) {
    List<Notification> notifications = notificationRepository.findByUserIdAndLimitAndOffset(userId, limit, offset);
    processNotifications(notifications, entityManager);
//    print(notifications);
    return notifications.size();
  }

  private void processNotifications(List<Notification> notifications, EntityManager entityManager){
    notifications.forEach(notification -> {
      entityManager.detach(notification);
    });
  }

  @Transactional
  @Override
  public long retieveNotificationsUsingStream(long userId) {
    long t1 = System.nanoTime();

    AtomicLong totalCnt = new AtomicLong();

    Stream<Notification> notificationStream = notificationRepository.streamAllByUserId(userId);

    try {
      notificationStream.forEach(notification -> {
        entityManager.detach(notification);
        totalCnt.getAndIncrement();
//        System.out.println("id: " + notification.getId() + " - " + notification.getCreationDate());
        System.out.println("Total cnt: " + totalCnt.get());
      });
    } catch (GenericJDBCException e) {
      e.printStackTrace();
    }

    long t2 = System.nanoTime();
    System.out.println("Total time: " + TimeUnit.SECONDS.convert(t2 - t1, TimeUnit.NANOSECONDS) + " Secs");

    return totalCnt.get();
  }

  @Transactional
  @Override
  public List<Notification> getNotifications(long userId, long limit, long offset) {
    return notificationRepository
        .streamAllByUserIdAndLimitAndOffset(userId, limit, offset)
        .collect(Collectors.toList());
  }

  @Override
  public long getNotificationCount(long userId) {
    return notificationRepository.getNotificationCount(userId);
  }

  private void print(List<Notification> notifications) {
    notifications.forEach(notification -> {
      System.out.println(notification.getId() + ", "
                         + notification.getUserId() + ", "
                         + notification.getAccountId() + ", "
                         + notification.getCreationDate());
    });
  }
}
