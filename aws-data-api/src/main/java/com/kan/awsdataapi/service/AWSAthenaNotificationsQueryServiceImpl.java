package com.kan.awsdataapi.service;

import com.kan.awsdataapi.dto.NotificationDTO;
import com.kan.awsdataapi.dto.NotificationDTO;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.athena.AthenaClient;
import software.amazon.awssdk.services.athena.model.*;
import software.amazon.awssdk.services.athena.paginators.GetQueryResultsIterable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class AWSAthenaNotificationsQueryServiceImpl implements AWSAthenaNotificationsQueryService {
  
  private static final String TYPE_JSON = "json";
  private static final String TYPE_CSV = "csv";
  private static final String TYPE_PARQUET = "parquet";

  private static final Map<String, String> ATHENA_DB_TABLE_MAP = Map.of(
      TYPE_JSON, "notifications_json",
      TYPE_CSV, "notifications_csv",
      TYPE_PARQUET, "notifications_parq"
  );

  private static final String ATHENA_DB = "cas_uat";
  private static final String ATHENA_S3_BUCKET = "s3://aws-athena-query-results-741610524140-ap-southeast-2/";

  public static final long SLEEP_AMOUNT_IN_MS = 1000;

  @Override
  public List<NotificationDTO> getNotifications(String type, Long idFrom, Long idTo) {
    AthenaClient athenaClient = AthenaClient
        .builder()
        .region(Region.AP_SOUTHEAST_2)
        .build();

    String query = "select * from " + ATHENA_DB_TABLE_MAP.get(type);

    String where = "";
    if(!idFrom.equals("")) {
      where += " id >= " + idFrom;
    }
    if(!idTo.equals("")) {
      if(!where.equals("")) {
        where += " and";
      }
      where += " id <= " + idTo;
    }
    if(!where.equals("")) {
      query += " where" + where;
    }

    query += " order by id;";

    System.out.println(query);

    String queryExecutionId = submitAthenaQuery(athenaClient, query);

    try {
      waitForQueryToComplete(athenaClient, queryExecutionId);
    } catch (InterruptedException e) {
      athenaClient.close();
      e.printStackTrace();
      return List.of();
    }

    List<NotificationDTO> notificationDTOs = getResult(athenaClient, queryExecutionId);
    athenaClient.close();

    return notificationDTOs;
  }

  public String submitAthenaQuery(AthenaClient athenaClient, String query) {

    try {
      // The QueryExecutionContext allows us to set the database
      QueryExecutionContext queryExecutionContext = QueryExecutionContext
          .builder()
          .database(ATHENA_DB)
          .build();

      // The result configuration specifies where the results of the query should go
      ResultConfiguration resultConfiguration = ResultConfiguration
          .builder()
          .outputLocation(ATHENA_S3_BUCKET)
          .build();

      StartQueryExecutionRequest startQueryExecutionRequest = StartQueryExecutionRequest
          .builder()
          .queryString(query)
          .queryExecutionContext(queryExecutionContext)
          .resultConfiguration(resultConfiguration)
          .build();

      StartQueryExecutionResponse startQueryExecutionResponse = athenaClient.startQueryExecution(startQueryExecutionRequest);
      return startQueryExecutionResponse.queryExecutionId();

    } catch (AthenaException e) {
      e.printStackTrace();
      return "";
    }
  }

  public void waitForQueryToComplete(AthenaClient athenaClient, String queryExecutionId) throws InterruptedException {
    GetQueryExecutionRequest getQueryExecutionRequest = GetQueryExecutionRequest
        .builder()
        .queryExecutionId(queryExecutionId)
        .build();

    GetQueryExecutionResponse getQueryExecutionResponse;
    boolean isQueryStillRunning = true;
    while (isQueryStillRunning) {
      getQueryExecutionResponse = athenaClient.getQueryExecution(getQueryExecutionRequest);
      String queryState = getQueryExecutionResponse.queryExecution().status().state().toString();
      if (queryState.equals(QueryExecutionState.FAILED.toString())) {
        throw new RuntimeException("The Amazon Athena query failed to run with error message: " + getQueryExecutionResponse
            .queryExecution().status().stateChangeReason());
      } else if (queryState.equals(QueryExecutionState.CANCELLED.toString())) {
        throw new RuntimeException("The Amazon Athena query was cancelled.");
      } else if (queryState.equals(QueryExecutionState.SUCCEEDED.toString())) {
        isQueryStillRunning = false;
      } else {
        // Sleep an amount of time before retrying again
        Thread.sleep(SLEEP_AMOUNT_IN_MS);
      }
      System.out.println("The current status is: " + queryState);
    }
  }

  private List<NotificationDTO> getResult(AthenaClient athenaClient, String queryExecutionId) {

    try {
      // Max Results can be set but if its not set,
      // it will choose the maximum page size
      GetQueryResultsRequest getQueryResultsRequest = GetQueryResultsRequest
          .builder()
          .queryExecutionId(queryExecutionId)
          .build();

      GetQueryResultsIterable getQueryResultsResults = athenaClient.getQueryResultsPaginator(getQueryResultsRequest);

      List<NotificationDTO> notificationDTOS = new ArrayList<>();

      for (GetQueryResultsResponse result : getQueryResultsResults) {
        //                List<ColumnInfo> columnInfoList = result.resultSet().resultSetMetadata().columnInfo();
        List<Row> rows = result.resultSet().rows();
        notificationDTOS.addAll(toJobDtos(rows));
      }

      return notificationDTOS;

    } catch (AthenaException e) {
      e.printStackTrace();
      return List.of();
    }
  }

  private List<NotificationDTO> toJobDtos(List<Row> rows){
    return rows
        .stream()
        .map(row -> toJobDto(row.data()))
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
  }

  private NotificationDTO toJobDto(List<Datum> rowData){
    if("id".equals(rowData.get(0).varCharValue())){
      return null;
    }

    return NotificationDTO
        .builder()
        .id(toLong(rowData.get(0).varCharValue()))
        .accountId(toLong(rowData.get(1).varCharValue()))
        .userId(toLong(rowData.get(2).varCharValue()))
        .companyId(rowData.get(3).varCharValue())
        .title(rowData.get(4).varCharValue())
        .description(rowData.get(4).varCharValue())
        .creationDate(rowData.get(4).varCharValue())
        .build();
  }

  private Long toLong(String str) {
    try {
      return Long.valueOf(str);
    } catch (NumberFormatException e) {
      return null;
    }
  }
}
