package com.kan.ukapidemo.dto;

import com.kan.ukapidemo.dto.generated.CompanyDetailsRequest;
import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companyDetailsRequest"
})
public class GovTalkMessageBodyDTO extends GovTalkMessage.Body {

  @XmlAnyElement(lax = true)
  protected CompanyDetailsRequest companyDetailsRequest;

  public CompanyDetailsRequest getCompanyDetailsRequest() {
    return companyDetailsRequest;
  }

  public void setCompanyDetailsRequest(CompanyDetailsRequest companyDetailsRequest) {
    this.companyDetailsRequest = companyDetailsRequest;
  }

}
