package com.kan.ukapidemo.dto;

import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "body"
})
@XmlRootElement(name = "GovTalkMessage", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
public class GovTalkMessageDTO extends GovTalkMessage {

  @XmlElement(name = "Body", namespace = "http://www.govtalk.gov.uk/schemas/govtalk/govtalkheader")
  protected GovTalkMessageBodyDTO body;

  @Override
  public GovTalkMessageBodyDTO getBody() {
    return body;
  }

  public void setBody(GovTalkMessageBodyDTO body) {
    this.body = body;
  }
}
