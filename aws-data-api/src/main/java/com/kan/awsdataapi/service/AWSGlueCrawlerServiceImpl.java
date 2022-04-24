package com.kan.awsdataapi.service;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.glue.AWSGlue;
import com.amazonaws.services.glue.AWSGlueClientBuilder;
import com.amazonaws.services.glue.model.StartCrawlerRequest;
import com.amazonaws.services.glue.model.StartCrawlerResult;
import org.springframework.stereotype.Service;

@Service
public class AWSGlueCrawlerServiceImpl implements AWSGlueCrawlerService {

  private static final String NOTIFICATIONS_CRAWLER_NAME = "cas360-dev-notifications-crawler";

  @Override
  public String startCrawler() {
    AWSGlue glue = AWSGlueClientBuilder.standard().withRegion(Regions.AP_SOUTHEAST_2).build();
    StartCrawlerRequest startCrawlerRequest = new StartCrawlerRequest();
    startCrawlerRequest.setName(NOTIFICATIONS_CRAWLER_NAME);
    StartCrawlerResult startCrawlerResult = glue.startCrawler(startCrawlerRequest);
    return String.valueOf(startCrawlerResult.getSdkHttpMetadata().getHttpStatusCode());
  }
}
