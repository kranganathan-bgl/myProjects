package com.kan.ukapidemo.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;

public class LocalDateTimeXmlAdapter extends XmlAdapter<String, LocalDateTime> {

  @Override
  public LocalDateTime unmarshal(String dateTimeStr) {
    return dateTimeStr != null ? LocalDateTime.parse(dateTimeStr) : null;
  }

  @Override
  public String marshal(LocalDateTime localDateTime) {
    return localDateTime != null ? localDateTime.toString() : "";
  }
}
