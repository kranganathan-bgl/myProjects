package com.kan.awsdasmonitor;

import com.kan.awsdasmonitor.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AppInit {

    @Autowired
    private MonitorService monitorService;

    @PostConstruct
    private void postConstruct() {
        monitorService.monitor();
    }
}
