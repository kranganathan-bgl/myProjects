package com.kan.awsdasmonitor.model;

import lombok.Data;

import java.util.List;

@Data
public class ActivityRecords {
    String type;
    String clusterId;
    String instanceId;
    List<ActivityEvent> databaseActivityEventList;
}
