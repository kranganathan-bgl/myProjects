package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.dto.generated.CompanyData;
import com.kan.ukapidemo.dto.generated.CompanyDataRequest;
import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import com.kan.ukapidemo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.LinkedHashMap;

import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.MessageDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication;
import static com.kan.ukapidemo.dto.generated.GovTalkMessage.Header.SenderDetails.IDAuthentication.Authentication;

@Service
public class ApiServiceImpl implements ApiService {

  private static final String PRESENTER_ID = "66664245000";
  private static final String PRESENTER_CODE = "CAREE4D99L0";

  private static final String TEST_PACKAGE_REF = "0012";

  private final MarshalService marshalService;
  private final HttpConnectionService httpConnectionService;
  private final MessageBuilderService messageBuilderService;

  private final XmlUtilityService xmlUtilityService;

  @Autowired
  public ApiServiceImpl(MarshalService marshalService,
                        HttpConnectionService httpConnectionService,
                        MessageBuilderService messageBuilderService,
                        XmlUtilityService xmlUtilityService) {
    this.marshalService = marshalService;
    this.httpConnectionService = httpConnectionService;
    this.messageBuilderService = messageBuilderService;
    this.xmlUtilityService = xmlUtilityService;
  }

  @Override
  public CompanyData getCompanyData() {
    GovTalkMessage govTalkMessage = messageBuilderService.getGovTalkMessage();
    govTalkMessage.setEnvelopeVersion("1.0");

    MessageDetails messageDetails = govTalkMessage.getHeader().getMessageDetails();
    messageDetails.setClazz("CompanyDataRequest");
    messageDetails.setQualifier("request");
    messageDetails.setTransactionID("1");
    messageDetails.setGatewayTest(1L);

    SenderDetails senderDetails = govTalkMessage.getHeader().getSenderDetails();
    IDAuthentication idAuthentication = senderDetails.getIDAuthentication();
    idAuthentication.setSenderID(toMD5(PRESENTER_ID).toLowerCase());
    Authentication authentication = idAuthentication.getAuthentication().get(0);
    authentication.setMethod("clear");
    authentication.setValue(toMD5(PRESENTER_CODE).toLowerCase());

    govTalkMessage.getBody().setAny(generateCompanyDataRequest());

    String xmlRequest = marshalService.marshal(govTalkMessage, GovTalkMessage.class);
    System.out.println(xmlRequest);
    xmlRequest = getWithNamespaceAndSchemaLocation(xmlRequest);
    System.out.println(xmlRequest);

    String xmlResponse = httpConnectionService.sendPostRequest(xmlRequest);
//    String xmlResponse = getTestXmlResponse();
    System.out.println(xmlResponse);

    Document document = xmlUtilityService.convertToXmlDocument(xmlResponse);
    setNamespaceToCompanyData(document);
    xmlResponse = xmlUtilityService.convertToXmlString(document);
    System.out.println(xmlResponse);

    Object obj = marshalService.unmarshal(xmlResponse, GovTalkMessage.class);

    GovTalkMessage resp = (GovTalkMessage) obj;
    Object anyObj = resp.getBody().getAny();

    if(anyObj instanceof CompanyData) {
      return (CompanyData) anyObj;
    }

    return null;
  }

  private String getWithNamespaceAndSchemaLocation(String xmlStr) {
    Document document = xmlUtilityService.convertToXmlDocument(xmlStr);

//    setNamespaceAndSchemaLocationToGovTalkMessage(document);
    setNamespaceAndSchemaLocationToCompanyDataRequest(document);

    return xmlUtilityService.convertToXmlString(document);
  }

  private void setNamespaceAndSchemaLocationToGovTalkMessage(Document document) {
    LinkedHashMap<String, String> nameSpaceMap = new LinkedHashMap<>();

    nameSpaceMap.put("xmlns", "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader");
    nameSpaceMap.put("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
    nameSpaceMap.put("xsi:schemaLocation", "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader http://xmlgw.companieshouse.gov.uk/v2-1/schema/Egov_ch.xsd");

    xmlUtilityService.setXmlElementAttributes(document, "/GovTalkMessage", nameSpaceMap);
  }

  private void setNamespaceAndSchemaLocationToCompanyDataRequest(Document document) {
    LinkedHashMap<String, String> nameSpaceMap = new LinkedHashMap<>();

    nameSpaceMap.put("xmlns", "http://xmlgw.companieshouse.gov.uk");
    nameSpaceMap.put("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
    nameSpaceMap.put("xsi:schemaLocation", "http://xmlgw.companieshouse.gov.uk http://xmlgw.companieshouse.gov.uk/v2-1/schema/CompanyData-v3-3.xsd");

    xmlUtilityService.setXmlElementAttributes(document, "/GovTalkMessage/Body/CompanyDataRequest", nameSpaceMap);
  }

  private void setNamespaceToCompanyData(Document document) {
    LinkedHashMap<String, String> nameSpaceMap = new LinkedHashMap<>();
    nameSpaceMap.put("xmlns", "http://xmlgw.companieshouse.gov.uk");
    xmlUtilityService.setXmlElementAttributes(document, "/GovTalkMessage/Body/CompanyData", nameSpaceMap);
  }
  private CompanyDataRequest generateCompanyDataRequest() {
    CompanyDataRequest companyDataRequest = new CompanyDataRequest();

    companyDataRequest.setCompanyNumber(Long.valueOf("01234567"));
    companyDataRequest.setCompanyAuthenticationCode("AUTH01");
    companyDataRequest.setMadeUpDate(LocalDate.parse("2016-05-13"));

    return companyDataRequest;
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
        <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
        <GovTalkMessage xmlns="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader" xmlns:ns2="http://www.w3.org/2000/09/xmldsig#"
                        xmlns:ns3="http://xmlgw.companieshouse.gov.uk">
            <EnvelopeVersion>1.0</EnvelopeVersion>
            <Header>
                <MessageDetails>
                    <Class>CompanyDataRequest</Class>
                    <Qualifier>request</Qualifier>
                    <TransactionID>1</TransactionID>
                    <GatewayTest>1</GatewayTest>
                </MessageDetails>
                <SenderDetails>
                    <IDAuthentication>
                        <SenderID>cf34c1e747b6f916ae48a3fea492d0d1</SenderID>
                        <Authentication>
                            <Method>clear</Method>
                            <Value>ffdcc76ca0b4a3d273575c765481bc75</Value>
                        </Authentication>
                    </IDAuthentication>
                </SenderDetails>
            </Header>
            <GovTalkDetails>
                <Keys/>
            </GovTalkDetails>
            <Body>
                <ns3:CompanyDataRequest>
                    <ns3:CompanyNumber>342391</ns3:CompanyNumber>
                    <ns3:CompanyAuthenticationCode>AUTH01</ns3:CompanyAuthenticationCode>
                    <ns3:MadeUpDate>2016-05-13</ns3:MadeUpDate>
                </ns3:CompanyDataRequest>
            </Body>
        </GovTalkMessage>
        """;
  }

  private String getTestCompanyData() {
    return """
        <CompanyData xmlns="http://xmlgw.companieshouse.gov.uk">
            <CompanyNumber>03176906</CompanyNumber>
            <CompanyName>MILLENNIUM STADIUM PLC</CompanyName>
            <CompanyCategory>PLC</CompanyCategory>
            <Jurisdiction>EW</Jurisdiction>
            <TradingOnMarket>false</TradingOnMarket>
            <DTR5Applies>false</DTR5Applies>
            <PSCExemptAsTradingOnRegulatedMarket>false</PSCExemptAsTradingOnRegulatedMarket>
            <PSCExemptAsSharesAdmittedOnMarket>false</PSCExemptAsSharesAdmittedOnMarket>
            <PSCExemptAsTradingOnUKRegulatedMarket>false</PSCExemptAsTradingOnUKRegulatedMarket>
            <MadeUpDate></MadeUpDate>
            <NextDueDate></NextDueDate>
            <RegisteredOfficeAddress>
                <Premise></Premise>
                <Street>Millennium Stadium</Street>
                <Thoroughfare>Westgate Street</Thoroughfare>
                <PostTown>Cardiff</PostTown>
                <Country>UNDEF</Country>
                <Postcode>CF10 1NS</Postcode>
            </RegisteredOfficeAddress>
        </CompanyData>
        """;
  }

  private String getTestXmlResponse() {
    return """
        <GovTalkMessage xsi:schemaLocation="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader http://xmlgw.companieshouse.gov.uk/v1-0/schema/Egov_ch.xsd"
                        xmlns="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#"
                        xmlns:gt="http://www.govtalk.gov.uk/schemas/govtalk/core" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
            <EnvelopeVersion>1.0</EnvelopeVersion>
            <Header>
                <MessageDetails>
                    <Class>CompanyDataRequest</Class>
                    <Qualifier>response</Qualifier>
                    <TransactionID>1</TransactionID>
                    <GatewayTest>1</GatewayTest>
                    <GatewayTimestamp>2023-07-16T00:43:41-00:00</GatewayTimestamp>
                </MessageDetails>
                <SenderDetails>
                    <IDAuthentication>
                        <SenderID>cf34c1e747b6f916ae48a3fea492d0d1</SenderID>
                        <Authentication>
                            <Method>CHMD5</Method>
                            <Value></Value>
                        </Authentication>
                    </IDAuthentication>
                </SenderDetails>
            </Header>
            <GovTalkDetails>
                <Keys/>
            </GovTalkDetails>
            <Body>
                <CompanyData>
                    <CompanyNumber>03176906</CompanyNumber>
                    <CompanyName>MILLENNIUM STADIUM PLC</CompanyName>
                    <CompanyCategory>PLC</CompanyCategory>
                    <Jurisdiction>EW</Jurisdiction>
                    <TradingOnMarket>false</TradingOnMarket>
                    <DTR5Applies>false</DTR5Applies>
                    <PSCExemptAsTradingOnRegulatedMarket>false</PSCExemptAsTradingOnRegulatedMarket>
                    <PSCExemptAsSharesAdmittedOnMarket>false</PSCExemptAsSharesAdmittedOnMarket>
                    <PSCExemptAsTradingOnUKRegulatedMarket>false</PSCExemptAsTradingOnUKRegulatedMarket>
                    <MadeUpDate>2023-07-19</MadeUpDate>
                    <NextDueDate></NextDueDate>
                    <RegisteredOfficeAddress>
                        <Premise></Premise>
                        <Street>Millennium Stadium</Street>
                        <Thoroughfare>Westgate Street</Thoroughfare>
                        <PostTown>Cardiff</PostTown>
                        <Country>UNDEF</Country>
                        <Postcode>CF10 1NS</Postcode>
                    </RegisteredOfficeAddress>
                </CompanyData>
            </Body>
        </GovTalkMessage>
        """;
  }

  private String getTestXmlResponse2() {
    return """
        <GovTalkMessage xsi:schemaLocation="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader http://xmlgw.companieshouse.gov.uk/v1-0/schema/Egov_ch.xsd" xmlns="http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader" xmlns:dsig="http://www.w3.org/2000/09/xmldsig#" xmlns:gt="http://www.govtalk.gov.uk/schemas/govtalk/core" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" >
          <EnvelopeVersion>1.0</EnvelopeVersion>
          <Header>
            <MessageDetails>
              <Class>CompanyDataRequest</Class>
              <Qualifier>response</Qualifier>
              <TransactionID>1</TransactionID>
              <GatewayTest>1</GatewayTest>
              <GatewayTimestamp>2023-07-16T00:43:41-00:00</GatewayTimestamp>
            </MessageDetails>
            <SenderDetails>
              <IDAuthentication>
                <SenderID>cf34c1e747b6f916ae48a3fea492d0d1</SenderID>
                <Authentication>
                  <Method>CHMD5</Method>
                  <Value></Value>
                </Authentication>
              </IDAuthentication>
            </SenderDetails>
          </Header>
          <GovTalkDetails>
            <Keys/>
          </GovTalkDetails>
          <Body>
        <CompanyData>
          <CompanyNumber>03176906</CompanyNumber>
          <CompanyName>MILLENNIUM STADIUM PLC</CompanyName>
          <CompanyCategory>PLC</CompanyCategory>
          <Jurisdiction>EW</Jurisdiction>
          <TradingOnMarket>false</TradingOnMarket>
          <DTR5Applies>false</DTR5Applies>
          <PSCExemptAsTradingOnRegulatedMarket>false</PSCExemptAsTradingOnRegulatedMarket>
          <PSCExemptAsSharesAdmittedOnMarket>false</PSCExemptAsSharesAdmittedOnMarket>
          <PSCExemptAsTradingOnUKRegulatedMarket>false</PSCExemptAsTradingOnUKRegulatedMarket>
          <MadeUpDate></MadeUpDate>
          <NextDueDate></NextDueDate>
          <RegisteredOfficeAddress>
            <Premise></Premise>
            <Street>Millennium Stadium</Street>
            <Thoroughfare>Westgate Street</Thoroughfare>
            <PostTown>Cardiff</PostTown>
            <Country>UNDEF</Country>
            <Postcode>CF10 1NS</Postcode>
          </RegisteredOfficeAddress>
          <SICCodes>
            <SICCode>9261</SICCode>
          </SICCodes>
          <Officers>
            <Director>
              <Person>
                <Forename>Maldwyn</Forename>
                <Surname>BEYNON</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>6</Premise>
                    <Street>Birch Grove</Street>
                    <PostTown>Brynmawr</PostTown>
                    <County>Gwent</County>
                    <Postcode>NP23 4TD</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1932-12-03</DOB>
                <Nationality>British</Nationality>
                <Occupation>Financial Arranger</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2001-08-02</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>David</Forename>
                <Forename>George</Forename>
                <Surname>COLLINS</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>157</Premise>
                    <Street>King George V Drive East</Street>
                    <PostTown>Cardiff</PostTown>
                    <County>South Glamorgan</County>
                    <Postcode>CF14 4EN</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1945-01-05</DOB>
                <Nationality>British</Nationality>
                <Occupation>Secretary General</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2008-12-01</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>Byron</Forename>
                <Surname>DAVIES</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise></Premise>
                    <Street>The Cottage</Street>
                    <Thoroughfare>Ystradowen</Thoroughfare>
                    <PostTown>Cowbridge</PostTown>
                    <County>South Glamorgan</County>
                    <Postcode>CF71 7SZ</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1947-04-23</DOB>
                <Nationality>British</Nationality>
                <Occupation>Chief Executive Cardiff Cc</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>1996-11-20</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>Martin</Forename>
                <Forename>Rodney</Forename>
                <Surname>DAVIES</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise></Premise>
                    <Street>Ferndale</Street>
                    <Thoroughfare>Ty Draw Road Lisvane</Thoroughfare>
                    <PostTown>Cardiff</PostTown>
                    <County>South Glamorgan</County>
                    <Postcode>CF14 0PF</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1942-05-17</DOB>
                <Nationality>British</Nationality>
                <Occupation>Retired Chartered Accountants</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2003-08-07</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>Geraint</Forename>
                <Surname>EDWARDS</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>6</Premise>
                    <Street>Hendremawr Close</Street>
                    <Thoroughfare>Sketty</Thoroughfare>
                    <PostTown>Swansea</PostTown>
                    <County>West Glamorgan</County>
                    <Postcode>SA2 9ND</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1940-09-21</DOB>
                <Nationality>British</Nationality>
                <Occupation>Retired Engineer</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2006-12-28</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>Kenneth</Forename>
                <Forename>James</Forename>
                <Surname>HEWITT</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise></Premise>
                    <Street>Green Meadows</Street>
                    <Thoroughfare>Llanfihangel Crucorney</Thoroughfare>
                    <PostTown>Abergavenny</PostTown>
                    <County>Monmouthshire</County>
                    <Postcode>NP7 7LB</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1936-07-09</DOB>
                <Nationality>British</Nationality>
                <Occupation>Retired Headteacher</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>1996-11-20</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Title>Cllr</Title>
                <Forename>Nigel</Forename>
                <Surname>HOWELLS</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>59</Premise>
                    <Street>Cecil Street</Street>
                    <PostTown>Cardiff</PostTown>
                    <County>South Glamorgan</County>
                    <Postcode>CF24 1NW</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1966-08-11</DOB>
                <Nationality>British</Nationality>
                <Occupation>Chartered Accountant</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2004-05-17</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>David</Forename>
                <Forename>Francis</Forename>
                <Surname>PICKERING</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>18</Premise>
                    <Street>Queen Anne Square</Street>
                    <Thoroughfare>Cathays</Thoroughfare>
                    <PostTown>Cardiff</PostTown>
                    <Postcode>CF10 3ED</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1960-12-16</DOB>
                <Nationality>British</Nationality>
                <Occupation>Company Director</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>1998-10-21</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>Joanne</Forename>
                <Forename>Sheila</Forename>
                <Surname>STANFORD</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>41</Premise>
                    <Street>Heol Croes Faen</Street>
                    <PostTown>Porthcawl</PostTown>
                    <County>Glamorgan</County>
                    <Postcode>CF36 3SW</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1965-02-15</DOB>
                <Nationality>British</Nationality>
                <Occupation>Group It Director</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2008-12-01</AppointmentDate>
            </Director>
            <Director>
              <Person>
                <Forename>Roy</Forename>
                <Forename>John</Forename>
                <Surname>THOMAS</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise>68</Premise>
                    <Street>Ryder Street</Street>
                    <PostTown>Cardiff</PostTown>
                    <Postcode>CF11 9BU</Postcode>
                  </Address>
                </ServiceAddress>
                <DOB>1962-12-17</DOB>
                <Nationality>British</Nationality>
                <Occupation>Lawyer</Occupation>
                <CountryOfResidence></CountryOfResidence>
              </Person>
              <AppointmentDate>2008-12-01</AppointmentDate>
            </Director>
            <Secretary>
              <Person>
                <Forename>Richard</Forename>
                <Forename>Stephen</Forename>
                <Surname>PHILLIPS</Surname>
                <ServiceAddress>
                  <Address>
                    <Premise></Premise>
                    <Street>BEDWEN Newtown</Street>
                    <PostTown>Ammanford</PostTown>
                    <County>Carmarthenshire</County>
                    <Postcode>SA18 3TE</Postcode>
                  </Address>
                </ServiceAddress>
              </Person>
              <AppointmentDate>2009-08-27</AppointmentDate>
            </Secretary>
          </Officers>
          <PSCs>
          </PSCs>
          <StatementOfCapital>
            <Capital>
              <TotalNumberOfIssuedShares>50001</TotalNumberOfIssuedShares>
              <ShareCurrency>GBP</ShareCurrency>
              <TotalAggregateNominalValue>50001</TotalAggregateNominalValue>
              <Shares>
                <ShareClass>Ordinary</ShareClass>
                <NumShares>50000</NumShares>
                <AmountPaidDuePerShare>0.000</AmountPaidDuePerShare>
                <AmountUnpaidPerShare>0.000</AmountUnpaidPerShare>
                <AggregateNominalValue>50000</AggregateNominalValue>
              </Shares>
              <Shares>
                <ShareClass>Special</ShareClass>
                <NumShares>1</NumShares>
                <AmountPaidDuePerShare>0.000</AmountPaidDuePerShare>
                <AmountUnpaidPerShare>0.000</AmountUnpaidPerShare>
                <AggregateNominalValue>1</AggregateNominalValue>
              </Shares>
            </Capital>
          </StatementOfCapital>
          <Shareholdings>
            <ShareClass>Special</ShareClass>
            <NumberHeld>1</NumberHeld>
            <Shareholders>
              <Name>
                <Surname>COUNTY COUNCIL OF THE CITY &amp; COUNTY OFCARDIFF</Surname>
              </Name>
              <Address>
                <Premise></Premise>
                <PostTown></PostTown>
              </Address>
            </Shareholders>
          </Shareholdings>
          <Shareholdings>
            <ShareClass>Ordinary</ShareClass>
            <NumberHeld>50000</NumberHeld>
            <Shareholders>
              <Name>
                <Surname>WELSH RUGBY UNION LTD</Surname>
              </Name>
              <Address>
                <Premise></Premise>
                <PostTown></PostTown>
              </Address>
            </Shareholders>
          </Shareholdings>
        </CompanyData>
          </Body>
        </GovTalkMessage>   
        """;
  }
}
