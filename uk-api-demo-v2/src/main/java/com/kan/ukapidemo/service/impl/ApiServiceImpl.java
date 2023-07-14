package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.dto.GovTalkMessageDTO;
import com.kan.ukapidemo.dto.generated.CompanyDetailsRequest;
import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import com.kan.ukapidemo.service.ApiService;
import com.kan.ukapidemo.service.HttpConnectionService;
import com.kan.ukapidemo.service.MarshalService;
import com.kan.ukapidemo.service.MessageBuilderService;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.MessageDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication;

@Service
public class ApiServiceImpl implements ApiService {

  private static final String PRESENTER_ID = "66664245000";
  private static final String PRESENTER_CODE = "";

  private static final String TEST_PACKAGE_REF = "0012";

  private final MarshalService marshalService;
  private final HttpConnectionService httpConnectionService;
  private final MessageBuilderService messageBuilderService;

  public ApiServiceImpl(MarshalService marshalService, HttpConnectionService httpConnectionService, MessageBuilderService messageBuilderService) {
    this.marshalService = marshalService;
    this.httpConnectionService = httpConnectionService;
    this.messageBuilderService = messageBuilderService;
  }

  @Override
  public GovTalkMessage getCompanyDetails() {
    GovTalkMessageDTO govTalkMessage = messageBuilderService.getGovTalkMessage();
    govTalkMessage.setEnvelopeVersion("1.0");

    MessageDetails messageDetails = govTalkMessage.getHeader().getMessageDetails();
    messageDetails.setClazz("CompanyDetails");
    messageDetails.setQualifier("request");
    messageDetails.setTransactionID("1");
    messageDetails.setGatewayTest(BigInteger.ONE);

    SenderDetails senderDetails = govTalkMessage.getHeader().getSenderDetails();
    IDAuthentication idAuthentication = senderDetails.getIDAuthentication();
    idAuthentication.setSenderID(toMD5(PRESENTER_ID).toLowerCase());
    Authentication authentication = idAuthentication.getAuthentication().get(0);
    authentication.setMethod("clear");
    authentication.setValue(toMD5(PRESENTER_CODE).toLowerCase());

    CompanyDetailsRequest companyDetailsRequest = new CompanyDetailsRequest();
    companyDetailsRequest.setCompanyNumber("03176906");
    companyDetailsRequest.setGiveMortTotals(true);

    govTalkMessage.getBody().setCompanyDetailsRequest(companyDetailsRequest);

    String xmlRequest = marshalService.marshal(govTalkMessage, GovTalkMessageDTO.class);
    System.out.println(xmlRequest);

//    String xmlResponse = httpConnectionService.sendPostRequest(xmlRequest);
    String xmlResponse = getTestXmlResponse();
    System.out.println(xmlResponse);

    return (GovTalkMessage) marshalService.unmarshal(xmlResponse, GovTalkMessageDTO.class);
  }

  private String toMD5(String input) {
    try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] messageDigest = md.digest(input.getBytes());
      return bytesToHex(messageDigest);
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  private String bytesToHex(byte[] bytes) {
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
      sb.append(String.format("%02x", b));
    }
    return sb.toString();
  }

  private String getTestXmlRequest() {
    return """
        <?xml version="1.0" ?>
        <GovTalkMessage>
            <EnvelopeVersion>1.0</EnvelopeVersion>
            <Header>
                <MessageDetails>
                    <Class>CompanyDetails</Class>
                    <Qualifier>request</Qualifier>
                    <TransactionID>1</TransactionID>
                    <GatewayTest>1</GatewayTest>
                </MessageDetails>
                <SenderDetails>
                    <IDAuthentication>
                        <SenderID>7b66d84b039d5c1660a6dca50060ec2a</SenderID>
                        <Authentication>
                            <Method>clear</Method>
                            <Value>42b5b8b9b4d68a71e338f4bfc63c4301</Value>
                        </Authentication>
                    </IDAuthentication>
                </SenderDetails>
            </Header>
            <GovTalkDetails>
                <Keys></Keys>
            </GovTalkDetails>
            <Body>
                <CompanyDetailsRequest>
                    <CompanyNumber>03176906</CompanyNumber>
                    <GiveMortTotals>true</GiveMortTotals>
                </CompanyDetailsRequest>
            </Body>
        </GovTalkMessage>
        """;
  }

  private String getTestXmlResponse() {
    return """
        <?xml version="1.0" encoding="UTF-8" ?>
        <GovTalkMessage xsi:schemaLocation="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader http://xmlgw.companieshouse.gov.uk/v1-0/schema/Egov_ch.xsd" xmlns="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#" xmlns:gt="http://www.govtalk.gov.uk/schemas/govtalk/core" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" >
          <EnvelopeVersion>1.0</EnvelopeVersion>
          <Header>
            <MessageDetails>
              <Class>CompanyDetails</Class>
              <Qualifier>error</Qualifier>
              <TransactionID>1</TransactionID>
              <GatewayTest>1</GatewayTest>
              <GatewayTimestamp>2023-07-10T06:46:46-00:00</GatewayTimestamp>
            </MessageDetails>
            <SenderDetails>
              <IDAuthentication>
                <SenderID>7b66d84b039d5c1660a6dca50060ec2a</SenderID>
                <Authentication>
                  <Method>CHMD5</Method>
                  <Value>42b5b8b9b4d68a71e338f4bfc63c4301</Value>
                </Authentication>
              </IDAuthentication>
            </SenderDetails>
          </Header>
          <GovTalkDetails>
            <Keys/>
        	<GovTalkErrors>
        	  <Error>
        	    <RaisedBy>CompanyDetails</RaisedBy>
        	    <Number>9999</Number>
        	    <Type>fatal</Type>
        	    <Text>Only non Electronic Filing accounts can access this service</Text>
        	    <Location></Location>
        	  </Error>
        	</GovTalkErrors>
          </GovTalkDetails>
          <Body>
          </Body>
        </GovTalkMessage>
        """;
  }
}
