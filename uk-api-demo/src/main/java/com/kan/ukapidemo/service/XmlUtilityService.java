package com.kan.ukapidemo.service;

import org.w3c.dom.Document;

import java.util.LinkedHashMap;

public interface XmlUtilityService {

  Document convertToXmlDocument(String xmlStr);

  String convertToXmlString(Document document);

  void setXmlElementAttributes(Document document, String xPathToTheElement, LinkedHashMap<String, String> attributeMap);
}
