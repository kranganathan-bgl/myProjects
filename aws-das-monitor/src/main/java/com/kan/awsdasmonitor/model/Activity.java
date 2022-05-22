package com.kan.awsdasmonitor.model;

import lombok.Data;

@Data
public class Activity {
    String type;
    String version;
    String databaseActivityEvents;
    String key;
}
