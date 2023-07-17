package com.kan.ukapidemo.dto;

import com.kan.ukapidemo.dto.generated.CompanyData;
import com.kan.ukapidemo.dto.generated.CompanyDataRequest;
import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Body", propOrder = {
    "companyDataRequest",
    "companyData"
})
public class GovTalkMessageBodyDTO extends GovTalkMessage.Body {

  @XmlElement(name = "CompanyDataRequest", namespace = "http://xmlgw.companieshouse.gov.uk")
  protected CompanyDataRequest companyDataRequest;

  @XmlElement(name = "CompanyData", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
  protected CompanyData companyData;

  public CompanyDataRequest getCompanyDataRequest() {
    return companyDataRequest;
  }

  public void setCompanyDataRequest(CompanyDataRequest companyDataRequest) {
    this.companyDataRequest = companyDataRequest;
  }

  public CompanyData getCompanyData() {
    return companyData;
  }

  public void setCompanyData(CompanyData companyData) {
    this.companyData = companyData;
  }
}
