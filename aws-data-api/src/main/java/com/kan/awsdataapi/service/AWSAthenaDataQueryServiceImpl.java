package com.kan.awsdataapi.service;

import com.kan.awsdataapi.dto.JobDTO;
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
public class AWSAthenaDataQueryServiceImpl implements AWSAthenaDataQueryService {

    private static final String TYPE_JSON = "json";
    private static final String TYPE_CSV = "csv";
    private static final String TYPE_PARQUET = "parquet";

    private static final Map<String, String> ATHENA_DB_TABLE_MAP = Map.of(
            TYPE_JSON, "jobs_json",
            TYPE_CSV, "jobs_csv",
            TYPE_PARQUET, "jobs_parquet"
    );

    private static final String ATHENA_DB = "testdb";
    private static final String ATHENA_S3_BUCKET = "s3://athena-data.kan-r.com/";

    public static final long SLEEP_AMOUNT_IN_MS = 1000;

    @Override
    public List<JobDTO> getJobs(String type, Long jobNoFrom, Long jobNoTo) {
        AthenaClient athenaClient = AthenaClient
                .builder()
                .region(Region.AP_SOUTHEAST_2)
                .build();

        String query = "select * from " + ATHENA_DB_TABLE_MAP.get(type);

        String where = "";
        if(!jobNoFrom.equals("")) {
            where += " jobNo >= " + jobNoFrom;
        }
        if(!jobNoTo.equals("")) {
            if(!where.equals("")) {
                where += " and";
            }
            where += " jobNo <= " + jobNoTo;
        }
        if(!where.equals("")) {
            query += " where" + where;
        }

        query += " order by jobNo;";

        System.out.println(query);

        String queryExecutionId = submitAthenaQuery(athenaClient, query);

        try {
            waitForQueryToComplete(athenaClient, queryExecutionId);
        } catch (InterruptedException e) {
            athenaClient.close();
            e.printStackTrace();
            return List.of();
        }

        List<JobDTO> jobDtos = getResult(athenaClient, queryExecutionId);
        athenaClient.close();

        return jobDtos;
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

    private List<JobDTO> getResult(AthenaClient athenaClient, String queryExecutionId) {

        try {
            // Max Results can be set but if its not set,
            // it will choose the maximum page size
            GetQueryResultsRequest getQueryResultsRequest = GetQueryResultsRequest
                    .builder()
                    .queryExecutionId(queryExecutionId)
                    .build();

            GetQueryResultsIterable getQueryResultsResults = athenaClient.getQueryResultsPaginator(getQueryResultsRequest);

            List<JobDTO> jobDTOS = new ArrayList<>();

            for (GetQueryResultsResponse result : getQueryResultsResults) {
//                List<ColumnInfo> columnInfoList = result.resultSet().resultSetMetadata().columnInfo();
                List<Row> rows = result.resultSet().rows();
                jobDTOS.addAll(toJobDtos(rows));
            }

            return jobDTOS;

        } catch (AthenaException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    private List<JobDTO> toJobDtos(List<Row> rows){
        return rows
                .stream()
                .map(row -> toJobDto(row.data()))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private JobDTO toJobDto(List<Datum> rowData){
        try{
            return JobDTO
                    .builder()
                    .jobNo(Long.valueOf(rowData.get(0).varCharValue()))
                    .jobName(rowData.get(1).varCharValue())
                    .jobType(rowData.get(2).varCharValue())
                    .jobStatus(rowData.get(3).varCharValue())
                    .dateCrt(rowData.get(4).varCharValue())
                    .build();
        }catch (NumberFormatException e){
            return null;
        }
    }
}
