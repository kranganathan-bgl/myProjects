package com.kan.service;


import java.nio.charset.StandardCharsets;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.util.StringUtils;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.amazonaws.services.lambda.model.ServiceException;

@Service
public class LambdaInvokerServiceImpl implements LambdaInvokerService{
    @Override
    public void invokeFunction(Regions region, String profile, String functionName, String payload) {
    	
    	 InvokeRequest invokeRequest = new InvokeRequest();
    	 invokeRequest
    	 	.withFunctionName(functionName)
    	 	.withPayload(payload);
         
         InvokeResult invokeResult = null;
         
         try {
           ProfileCredentialsProvider awsCreds = new ProfileCredentialsProvider();
             AWSLambda awsLambda = AWSLambdaClientBuilder.standard()
                     .withCredentials(new ProfileCredentialsProvider(profile))
                     .withRegion(region).build();

             invokeResult = awsLambda.invoke(invokeRequest);

             String ans = new String(invokeResult.getPayload().array(), StandardCharsets.UTF_8);

             //write out the return value
             System.out.print("Result: ");
             System.out.println(ans);

             if(!StringUtils.isNullOrEmpty(invokeResult.getFunctionError())){
               System.out.print("Error: ");
               System.out.println(invokeResult.getFunctionError());
             }

         } catch (ServiceException e) {
             System.out.println(e);
         }
    }
}
