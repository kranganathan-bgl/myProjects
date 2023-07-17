package com.kan.ukapidemo.service;

import com.kan.ukapidemo.dto.GovTalkMessageDTO;
import com.kan.ukapidemo.dto.generated.CompanyData;
import com.kan.ukapidemo.dto.generated.GovTalkMessage;

public interface ApiService {
  GovTalkMessageDTO getCompanyDetails();

  CompanyData getCompanyData();
}
