package com.kan.ukapidemo.service;

public interface MarshalService {

  String marshal(Object object, Class clazz);

  Object unmarshal(String xmlString, Class clazz);
}
