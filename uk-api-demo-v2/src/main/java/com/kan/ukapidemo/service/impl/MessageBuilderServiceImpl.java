package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.dto.GovTalkMessageBodyDTO;
import com.kan.ukapidemo.dto.GovTalkMessageDTO;
import com.kan.ukapidemo.dto.generated.ObjectFactory;
import com.kan.ukapidemo.service.MessageBuilderService;
import org.springframework.stereotype.Service;

import static com.kan.ukapidemo.dto.generated.GovTalkMessage.*;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.GovTalkDetails.*;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.*;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.*;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication.*;

@Service
public class MessageBuilderServiceImpl implements MessageBuilderService {
  @Override
  public GovTalkMessageDTO getGovTalkMessage() {
    ObjectFactory factory = new ObjectFactory();

    GovTalkMessageDTO govTalkMessage = new GovTalkMessageDTO();

    Header header = factory.createGovTalkMessageHeader();
    GovTalkDetails govTalkDetails = factory.createGovTalkMessageGovTalkDetails();
    Keys keys = factory.createGovTalkMessageGovTalkDetailsKeys();
    GovTalkMessageBodyDTO body = new GovTalkMessageBodyDTO();

    MessageDetails messageDetails = factory.createGovTalkMessageHeaderMessageDetails();
    SenderDetails senderDetails = factory.createGovTalkMessageHeaderSenderDetails();

    IDAuthentication idAuthentication = factory.createGovTalkMessageHeaderSenderDetailsIDAuthentication();
    Authentication authentication = factory.createGovTalkMessageHeaderSenderDetailsIDAuthenticationAuthentication();

    govTalkMessage.setHeader(header);
    govTalkMessage.setGovTalkDetails(govTalkDetails);
    govTalkMessage.setBody(body);

    header.setMessageDetails(messageDetails);
    header.setSenderDetails(senderDetails);

    govTalkDetails.setKeys(keys);

    senderDetails.setIDAuthentication(idAuthentication);
    idAuthentication.getAuthentication().add(authentication);

    return govTalkMessage;
  }
}
