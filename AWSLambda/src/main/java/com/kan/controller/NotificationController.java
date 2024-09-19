package com.kan.controller;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApiAsyncClient;
import com.amazonaws.services.apigatewaymanagementapi.AmazonApiGatewayManagementApiAsyncClientBuilder;
import com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionRequest;
import com.amazonaws.services.apigatewaymanagementapi.model.PostToConnectionResult;
import com.amazonaws.services.dynamodbv2.xspec.S;
import com.kan.service.ApiGatewayManagementClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.amazonaws.regions.Regions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kan.model.Notification;
import com.kan.service.LambdaInvokerService;
import org.springframework.web.client.RestTemplate;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.Future;

@CrossOrigin
@RestController
public class NotificationController {
	
	@Autowired
	LambdaInvokerService lambdaInvokerService;

	@Autowired
	ApiGatewayManagementClientService apiGatewayManagementClientService;

	private final boolean isBgl = false;

	private final String REST_API_URL = "https://t2voqxnvu2.execute-api.ap-southeast-2.amazonaws.com/notify";

//	From WS_API_URL_V2
//	uat -> 			wss://ws.uat.cas360.com.au
//	uat2 -> 		wss://ws.uat2.cas360.com.au
//	staging -> 	wss://ws.staging.cas360.com.au
//	uat.sg -> 	wss://ws.uat.cas360.com.sg
//	uat.uk ->		wss://ws.uat.cas360app.co.uk
//	prod -> 		wss://ws.cas360.com
//	prod.sg ->	wss://ws.cas360.com.sg
//	prod.uk ->	wss://ws.cas360app.co.uk

//	From WS_NOTIFY_FUNC_V2
	private static final Map<String, String> ENV_TO_FUNCTION_NAME_MAP = Map.of(
			"uat", "cas360-ws-api-uat-notify-V2",
			"uat2", "cas360-ws-api-uat2-notify-V2",
			"staging", "cas360-ws-api-staging-notify-V2",
			"uat.sg", "cas360-ws-api-uat-notify-V2",
			"uat.uk", "cas360-ws-api-uat-notify-V2",
			"prod", "cas360-ws-api-production-notify-V2",
			"prod.sg", "cas360-ws-api-production-notify-V2",
			"prod.uk", "cas360-ws-api-production-notify-V2"
	);

	private static final Map<String, Regions> ENV_TO_REGION_MAP = Map.of(
			"uat", Regions.AP_SOUTHEAST_2,
			"uat2", Regions.AP_SOUTHEAST_2,
			"staging", Regions.AP_SOUTHEAST_2,
			"uat.sg", Regions.AP_SOUTHEAST_1,
			"uat.uk", Regions.EU_WEST_2,
			"prod", Regions.AP_SOUTHEAST_2,
			"prod.sg", Regions.AP_SOUTHEAST_1,
			"prod.uk", Regions.EU_WEST_2
	);

	private static final Map<String, String> ENV_TO_PROFILE_MAP = Map.of(
			"uat", "default",
			"uat2", "default",
			"staging", "default",
			"uat.sg", "sguat",
			"uat.uk", "ukuat",
			"prod", "prod",
			"prod.sg", "sgprod",
			"prod.uk", "ukprod"
	);

	@PostMapping("/notify/{env}")
	public void notify3(@RequestBody Notification notification, @PathVariable("env") String env) throws JsonProcessingException {
		System.out.println(notification);

		Regions region = ENV_TO_REGION_MAP.get(env);
		String profile = ENV_TO_PROFILE_MAP.get(env);
		String function = ENV_TO_FUNCTION_NAME_MAP.get(env);

		if(region == null || function == null) {
			throw new RuntimeException("Invalid environment: " + env);
		}

		ObjectMapper objectMapper = new ObjectMapper();
		String payload = objectMapper.writeValueAsString(notification);
		lambdaInvokerService.invokeFunction(region, profile, function, payload);
	}

	@PostMapping("/notify2")
	public void notify2(@RequestBody Notification notification) throws JsonProcessingException {
		System.out.println(notification);

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> resp = restTemplate.postForEntity(REST_API_URL, notification, String.class);

		System.out.println(resp);
	}
}
