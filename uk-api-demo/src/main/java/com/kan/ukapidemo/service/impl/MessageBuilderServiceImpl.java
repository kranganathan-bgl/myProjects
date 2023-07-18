package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import com.kan.ukapidemo.dto.generated.ObjectFactory;
import com.kan.ukapidemo.service.MessageBuilderService;
import org.springframework.stereotype.Service;

import static com.kan.ukapidemo.dto.generated.GovTalkMessage.GovTalkDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.GovTalkDetails.Keys;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.MessageDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication;

@Service
public class MessageBuilderServiceImpl implements MessageBuilderService {

  @Override
  public GovTalkMessage getGovTalkMessage() {
    ObjectFactory factory = new ObjectFactory();

    GovTalkMessage govTalkMessage = factory.createGovTalkMessage();

    Header header = factory.createGovTalkMessageHeader();
    GovTalkDetails govTalkDetails = factory.createGovTalkMessageGovTalkDetails();
    Keys keys = factory.createGovTalkMessageGovTalkDetailsKeys();
    GovTalkMessage.Body body = factory.createGovTalkMessageBody();

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
