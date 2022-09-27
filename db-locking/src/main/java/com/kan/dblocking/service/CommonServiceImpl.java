package com.kan.dblocking.service;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.util.Map;

import static java.sql.Connection.*;

@Slf4j
@Service
public class CommonServiceImpl implements CommonService {

  private final static Map<Integer, String> txLevelToDescriptionMap = Map.of(TRANSACTION_NONE,
                                                                             "NONE",
                                                                             TRANSACTION_READ_UNCOMMITTED,
                                                                             "READ_UNCOMMITTED",
                                                                             TRANSACTION_READ_COMMITTED,
                                                                             "READ_COMMITTED",
                                                                             TRANSACTION_REPEATABLE_READ,
                                                                             "REPEATABLE_READ",
                                                                             TRANSACTION_SERIALIZABLE,
                                                                             "SERIALIZABLE");

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public void logTransactionIsolationLevel() {
    Session session = entityManager.unwrap(Session.class);
    log.info("Tx Level: " + txLevelToDescriptionMap.get(session.doReturningWork(Connection::getTransactionIsolation)));
  }
}
