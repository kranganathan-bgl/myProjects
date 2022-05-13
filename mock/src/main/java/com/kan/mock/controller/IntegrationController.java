package com.kan.mock.controller;

import com.kan.mock.dto.IntegrationsContactDTO;
import com.kan.mock.dto.IntegrationsIdTimestampDTO;
import com.kan.mock.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/integration")
public class IntegrationController {

  @Autowired
  private IntegrationService integrationService;

  @PostMapping("/add/contact/CAS/{id}")
  public IntegrationsIdTimestampDTO addContact(@PathVariable String id, @RequestBody IntegrationsContactDTO dto){
    System.out.println(("add: " + id));
    return integrationService.getIntegrationDets();
  }

  @PostMapping("/modify/contact/CAS/{accountId}/{integrationsId}")
  public IntegrationsIdTimestampDTO modifyContact(@PathVariable String accountId, @PathVariable String integrationsId, @RequestBody IntegrationsContactDTO dto){
    System.out.println(("modify: " + accountId));
    return integrationService.getIntegrationDets();
  }
}
