package com.kan.awsdasmonitor.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class
ActivityEvent {
    @SerializedName("class") String _class;
    String clientApplication;
    String command;
    String commandText;
    String databaseName;
    String dbProtocol;
    String dbUserName;
    String endTime;
    String errorMessage;
    String exitCode;
    String logTime;
    String netProtocol;
    String objectName;
    String objectType;
    List<String> paramList;
    String pid;
    String remoteHost;
    String remotePort;
    String rowCount;
    String serverHost;
    String serverType;
    String serverVersion;
    String serviceName;
    String sessionId;
    String startTime;
    String statementId;
    String substatementId;
    String transactionId;
    String type;
}
