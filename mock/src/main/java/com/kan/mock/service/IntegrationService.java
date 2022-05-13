package com.kan.mock.service;

import com.kan.mock.dto.IntegrationsIdTimestampDTO;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

  private static long id = 1000;

  public IntegrationsIdTimestampDTO getIntegrationDets() {
    IntegrationsIdTimestampDTO dto = new IntegrationsIdTimestampDTO();
    dto.setId(String.valueOf(id++));
    dto.setTimeStamp(java.time.LocalDateTime.now().toEpochSecond(java.time.ZoneOffset.UTC));
    return dto;
  }
}
