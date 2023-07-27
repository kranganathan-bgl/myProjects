package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.service.XmlUtilityService;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.LinkedHashMap;

@Service
public class XmlUtilityServiceImpl implements XmlUtilityService {

  @Override
  public Document convertToXmlDocument(@NonNull String xmlStr) {
    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    docBuilderFactory.setExpandEntityReferences(false);

    try {
      DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
      return docBuilder.parse(new InputSource(new StringReader(xmlStr)));

    } catch (ParserConfigurationException | IOException | SAXException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String convertToXmlString(@NonNull Document document) {
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
    transformerFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");

    try {
      DOMSource source = new DOMSource(document);
      StringWriter strWriter = new StringWriter();
      StreamResult result = new StreamResult(strWriter);

      transformerFactory.newTransformer().transform(source, result);

      return strWriter.getBuffer().toString();

    } catch (TransformerException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void setXmlElementAttributes(@NonNull Document document, @NonNull String xPathToTheElement, @NonNull LinkedHashMap<String, String> attributeMap) {
    XPath xPath = XPathFactory.newInstance().newXPath();

    try {
      Node node = (Node) xPath.compile(xPathToTheElement).evaluate(document, XPathConstants.NODE);
      if (node == null || Node.ELEMENT_NODE != node.getNodeType()) {
        return;
      }

      Element element = (Element) node;
      attributeMap.forEach((key, value) -> {
        element.setAttribute(key, value);
      });

    } catch (XPathExpressionException e) {
      throw new RuntimeException(e);
    }
  }
}
