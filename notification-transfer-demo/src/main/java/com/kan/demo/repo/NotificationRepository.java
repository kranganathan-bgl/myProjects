package com.kan.demo.repo;

import com.kan.demo.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import javax.persistence.QueryHint;
import java.util.List;
import java.util.stream.Stream;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

  @QueryHints(value = {
      @QueryHint(name = "org.hibernate.cacheable", value = "false")
  })
  @Query(value="SELECT * FROM Notification " +
               "WHERE userId = :userId AND isArchived = false LIMIT :limit OFFSET :offset", nativeQuery = true)
  List<Notification> findByUserIdAndLimitAndOffset(long userId, long limit, long offset);

  @Query(value="SELECT * FROM Notification " +
               "LIMIT :limit OFFSET :offset", nativeQuery = true)
  List<Notification> findAllByLimitAndOffset(long limit, long offset);


  @QueryHints(value = {
      @QueryHint(name = "org.hibernate.fetchSize", value = "" + Integer.MIN_VALUE),
      @QueryHint(name = "org.hibernate.cacheable", value = "false"),
      @QueryHint(name = "org.hibernate.readOnly", value = "true")
  })
  @Query(value="SELECT * FROM Notification " +
               "WHERE userId = :userId", nativeQuery = true)
  Stream<Notification> streamAllByUserId(long userId);

  @QueryHints(value = {
      @QueryHint(name = "org.hibernate.fetchSize", value = "" + Integer.MIN_VALUE),
      @QueryHint(name = "org.hibernate.cacheable", value = "false"),
      @QueryHint(name = "org.hibernate.readOnly", value = "true")
  })
  @Query(value="SELECT * FROM Notification " +
               "WHERE userId = :userId " +
               "LIMIT :limit OFFSET :offset", nativeQuery = true)
  Stream<Notification> streamAllByUserIdAndLimitAndOffset(long userId, long limit, long offset);

  @QueryHints(value = {
      @QueryHint(name = "org.hibernate.cacheable", value = "false"),
      @QueryHint(name = "org.hibernate.readOnly", value = "true")
  })
  @Query(value = "select count(*) " +
                 "from Notification " +
                 "where userId = :userId", nativeQuery = true)
  long getNotificationCount(long userId);
}
