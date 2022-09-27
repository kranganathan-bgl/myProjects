package com.kan;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BinLogMonitor {

  private static final Map<Long, String> tableMap = new HashMap<>();

  public static void main(String[] args) throws Exception {
    monitorBinLog();
  }

  private static void monitorBinLog() throws Exception {
    BinaryLogClient client = new BinaryLogClient("localhost", 3306, "six", "six6");

    client.registerEventListener(event -> {
      EventData data = event.getData();

      if (data instanceof TableMapEventData) {
        TableMapEventData tableData = (TableMapEventData) data;
        tableMap.put(tableData.getTableId(), tableData.getTable());
      } else if (data instanceof WriteRowsEventData) {
        WriteRowsEventData eventData = (WriteRowsEventData) data;

        System.out.print("INSERT -> ");
        System.out.println(tableMap.get(eventData.getTableId()));
        for (Object[] row : eventData.getRows()) {
          System.out.println(toStringList(row));
        }
      } else if (data instanceof UpdateRowsEventData) {
        UpdateRowsEventData eventData = (UpdateRowsEventData) data;

        System.out.print("UPDATE -> ");
        System.out.println(tableMap.get(eventData.getTableId()));
        for (Map.Entry<Serializable[], Serializable[]> row : eventData.getRows()) {
          System.out.print("From: \t");
          System.out.println(toStringList(row.getKey()));
          System.out.print("To: \t");
          System.out.println(toStringList(row.getValue()));
        }
      } else if (data instanceof DeleteRowsEventData) {
        DeleteRowsEventData eventData = (DeleteRowsEventData) data;

        System.out.print("DELETE -> ");
        System.out.println(tableMap.get(eventData.getTableId()));
        for (Object[] row : eventData.getRows()) {
          System.out.println(toStringList(row));
        }
      }
    });
    client.connect();
  }

  private static List<String> toStringList(Object[] columnValues) {
    return Arrays.stream(columnValues).map(String::valueOf).collect(Collectors.toList());
  }
}

