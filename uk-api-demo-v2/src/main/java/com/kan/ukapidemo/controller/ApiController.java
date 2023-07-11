package com.kan.ukapidemo.controller;

import com.kan.ukapidemo.dto.generated.GovTalkMessage;
import com.kan.ukapidemo.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uk/api")
public class ApiController {

  private final ApiService apiService;

  public ApiController(ApiService apiService) {
    this.apiService = apiService;
  }

  @GetMapping("/companyDetails")
  public GovTalkMessage getCompanyDetails() {
    return apiService.getCompanyDetails();
  }
}
