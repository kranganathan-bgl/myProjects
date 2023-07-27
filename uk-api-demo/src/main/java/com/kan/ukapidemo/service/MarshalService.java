package com.kan.ukapidemo.service;

import org.w3c.dom.Node;

public interface MarshalService {

  String marshal(Object object, Class clazz);

  Object unmarshal(String xmlString, Class clazz);
}
