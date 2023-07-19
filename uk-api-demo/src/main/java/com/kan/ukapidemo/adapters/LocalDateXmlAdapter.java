package com.kan.ukapidemo.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;

public class LocalDateXmlAdapter extends XmlAdapter<String, LocalDate> {

  @Override
  public LocalDate unmarshal(String dateStr) {
    return dateStr != null ? LocalDate.parse(dateStr) : null;
  }

  @Override
  public String marshal(LocalDate localDate) {
    return localDate != null ? localDate.toString() : "";
  }
}
