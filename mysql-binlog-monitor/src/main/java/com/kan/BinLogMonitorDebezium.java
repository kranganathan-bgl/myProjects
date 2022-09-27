package com.kan;

import io.debezium.config.Configuration;
import io.debezium.connector.mysql.MySqlConnectorConfig;
import io.debezium.embedded.EmbeddedEngine;
import io.debezium.engine.ChangeEvent;
import io.debezium.engine.DebeziumEngine;
import io.debezium.engine.format.Json;
import io.debezium.relational.history.FileDatabaseHistory;
import io.debezium.relational.history.MemoryDatabaseHistory;
import io.debezium.util.Clock;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.source.SourceRecord;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BinLogMonitorDebezium {

  private static final String APP_NAME = "BinLogMonitorDebezium-10";
  private static Configuration config = Configuration.empty();
  private static final Properties props = config.asProperties();
  private EmbeddedEngine engine;

  public static void main(String[] args) throws Exception {
    new BinLogMonitorDebezium().monitorBinLog2();
  }

  private void monitorBinLog() throws Exception {
    setConfig();
    engine = EmbeddedEngine.create().using(config).using(this.getClass().getClassLoader()).using(Clock.SYSTEM).notifying(this::processRecord).build();

    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(engine);

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.out.println("Requesting embedded engine to shut down");
      engine.stop();
    }));

    // the submitted task keeps running, only no more new ones can be added
    executor.shutdown();

    awaitTermination(executor);
  }

  private void monitorBinLog2() throws Exception {
    setConfigProps();

    // Create the engine with this configuration ...
    try (DebeziumEngine<ChangeEvent<String, String>> engine = DebeziumEngine.create(Json.class)
                                                                            .using(props)
                                                                            .notifying(record -> {
                                                                              System.out.println(record);
                                                                            })
                                                                            .build()) {
      ExecutorService executor = Executors.newSingleThreadExecutor();
      executor.execute(engine);

      Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        System.out.println("Requesting embedded engine to shut down");
        try {
          engine.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }));

      // the submitted task keeps running, only no more new ones can be added
      executor.shutdown();

      awaitTermination(executor);
    }
  }

  private void awaitTermination(ExecutorService executor) {
    try {
      while (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
        System.out.println("Waiting another 10 seconds for the embedded engine to complete");
      }
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  private void setConfigProps() {
    props.setProperty("name", APP_NAME);
    props.setProperty("connector.class", "io.debezium.connector.mysql.MySqlConnector");
    props.setProperty("offset.storage", "org.apache.kafka.connect.storage.FileOffsetBackingStore");
    props.setProperty("offset.storage.file.filename", "/tmp/offsets.dat");
//    props.setProperty("offset.flush.interval.ms", "60000");
    props.setProperty("database.hostname", "localhost");
    props.setProperty("database.port", "3306");
    props.setProperty("database.user", "six");
    props.setProperty("database.password", "six6");
//    props.setProperty("database.server.id", "1");
    props.setProperty("database.server.name", APP_NAME);
    props.setProperty("database.history", "io.debezium.relational.history.FileDatabaseHistory");
    props.setProperty("database.history.file.filename", "/tmp/dbhistory.dat");
//    props.setProperty("database.include.list", "cassix");
//    props.setProperty("schema.include.list", "cassix");
//    props.setProperty("table.include.list", "cassix.test");
//    props.setProperty("snapshot.include.collection.list", "cassix.test");
//    props.setProperty("database.whitelist", "cassix");
//    props.setProperty("table.whitelist", "cassix.test");
//    props.setProperty("schema.whitelist", "cassix");
//    props.setProperty("schema.whitelist", "cassix.test");
//    props.setProperty("snapshot.new.tables", "parallel");
//    props.setProperty("snapshot.mode", "schema_only");
//    props.setProperty("include.schema.changes", "true");
  }

  private void setConfig() {
    config = config.withSystemProperties(Function.identity())
                   .edit()
                   .with(EmbeddedEngine.CONNECTOR_CLASS, "io.debezium.connector.mysql.MySqlConnector")
                   .with(EmbeddedEngine.ENGINE_NAME, APP_NAME)

                   .with(MySqlConnectorConfig.SERVER_NAME, APP_NAME)
                   .with(MySqlConnectorConfig.SERVER_ID, 1)
                   .with(MySqlConnectorConfig.HOSTNAME, "localhost")
                   .with(MySqlConnectorConfig.PORT, 3306)
                   .with(MySqlConnectorConfig.USER, "six")
                   .with(MySqlConnectorConfig.PASSWORD, "six6")
//                   .with(MySqlConnectorConfig.DATABASE_NAME, "cassix")
//                   .with(MySqlConnectorConfig.DATABASE_INCLUDE_LIST, "cassix")
//                   .with(MySqlConnectorConfig.TABLE_INCLUDE_LIST, "cassix.test")

                   // for demo purposes let's store offsets and history only in memory
                   .with(EmbeddedEngine.OFFSET_STORAGE, "org.apache.kafka.connect.storage.MemoryOffsetBackingStore")
                   .with(MySqlConnectorConfig.DATABASE_HISTORY, MemoryDatabaseHistory.class.getName())
//                                      .with(MySqlConnectorConfig.DATABASE_HISTORY, FileDatabaseHistory.class.getName())

                   // Send JSON without schema
                   .with("schemas.enable", false)
                   .build();
  }

  private void processRecord(SourceRecord record) {
    // We are interested only in data events not schema change events
    if (record.topic().equals(APP_NAME)) {
      return;
    }

    Schema schema = null;

    if (record.keySchema() == null) {
      System.out.println("The keySchema is missing. Something is wrong.");
      return;
    }

    // For deletes, the value node is null
    if (null != record.valueSchema()) {
      schema = SchemaBuilder.struct().field("key", record.keySchema()).field("value", record.valueSchema()).build();
    } else {
      schema = SchemaBuilder.struct().field("key", record.keySchema()).build();
    }

    Struct message = new Struct(schema);
    message.put("key", record.key());

    if(record.value() != null) {
      message.put("value", record.value());
      System.out.println("--------------------------------");
      System.out.println(record.value());
    }
  }


}
