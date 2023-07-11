package com.kan.ukapidemo.service.impl;

import com.kan.ukapidemo.service.HttpConnectionService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.List;

@Service
public class HttpConnectionServiceImpl implements HttpConnectionService {

  private static final String POST_URL = "https://xmlgw.companieshouse.gov.uk/v1-0/xmlgw/Gateway";

  @Override
  public String sendPostRequest(String xmlStr) {
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.valueOf("text/xml"));
    headers.setAcceptCharset(List.of(Charset.forName("utf-8")));

    HttpEntity<String> entity = new HttpEntity<>(xmlStr, headers);
    ResponseEntity<String> response = restTemplate.postForEntity(POST_URL, entity, String.class);

    if(response.getStatusCode() != HttpStatus.OK) {
      throw new RuntimeException("POST request did not work.");
    }

    return response.getBody();
  }
}
