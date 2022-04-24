package com.kan.awsdataapi.controller;

import com.kan.awsdataapi.service.AWSGlueCrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/crawler")
public class AWSGlueCrawlerController {

  @Autowired
  private AWSGlueCrawlerService awsGlueCrawlerService;

  @GetMapping("/start")
  public String startCrawler() {
    return awsGlueCrawlerService.startCrawler();
  }
}
