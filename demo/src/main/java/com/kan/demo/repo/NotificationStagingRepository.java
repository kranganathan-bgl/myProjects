package com.kan.demo.repo;

import com.kan.demo.model.NotificationStaging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import javax.persistence.QueryHint;

public interface NotificationStagingRepository extends JpaRepository<NotificationStaging, Long> {

  @QueryHints(value = {
      @QueryHint(name = "org.hibernate.cacheable", value = "false")
  })
  @Modifying
  @Query(value = "insert into NotificationStaging " +
                 "select * from Notification " +
                 "where userId = :userId " +
                 "limit :limit offset :offset", nativeQuery = true)
  public void transferDataFromNotification(long userId, long limit, long offset);
}
