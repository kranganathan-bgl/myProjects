package com.kan.service;

import com.amazonaws.regions.Regions;

public interface LambdaInvokerService {
    void invokeFunction(Regions region, String profile, String functionName, String payload);
}
