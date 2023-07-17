package com.kan.ukapidemo.service;

import com.kan.ukapidemo.dto.GovTalkMessageDTO;
import com.kan.ukapidemo.dto.generated.GovTalkMessage;

public interface MessageBuilderService {
  GovTalkMessageDTO getGovTalkMessageDto();

  GovTalkMessage getGovTalkMessage();
}
