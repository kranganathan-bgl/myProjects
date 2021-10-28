package com.kan.demo.repo;

import com.kan.demo.model.NotificationDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface NotificationDateRepository extends JpaRepository<NotificationDate, Long> {

  @Modifying
  @Query(value = "insert into NotificationDate " +
                 "select id, userId, creationDate, isArchived from Notification " +
                 "where userId = :userId " +
                 "limit :limit offset :offset", nativeQuery = true)
  public void transferDataFromNotification(long userId, long limit, long offset);
}
