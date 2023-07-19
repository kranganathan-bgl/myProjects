package com.kan.ukapidemo.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class LongXmlAdapter extends XmlAdapter<String, Long> {
  @Override
  public Long unmarshal(String longStr) throws Exception {
    return longStr != null ? Long.valueOf(longStr) : null;
  }

  @Override
  public String marshal(Long longObj) throws Exception {
    return longObj != null ? longObj.toString() : "";
  }
}
