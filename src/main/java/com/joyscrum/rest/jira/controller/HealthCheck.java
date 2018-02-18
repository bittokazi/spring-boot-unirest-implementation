package com.joyscrum.rest.jira.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyscrum.rest.jira.services.RestEndpoints;

@RestController
public class HealthCheck {
RestEndpoints restEndpoints;
	
	public HealthCheck() {
		this.restEndpoints = new RestEndpoints();
	}
	
	private final Logger logger = LoggerFactory.getLogger(HealthCheck.class);
	
	@GetMapping("/health")
	public Map<String, Object> healthCheck(HttpServletRequest req) {
		Map<String, Object> json = new HashMap<>();
		json.put("healthCheck", "ok");
		return json;
	}
	
	@GetMapping("/testGet")
	public Map<String, Object> testGet(HttpServletRequest req) {
		Map<String, Object> json = new HashMap<>();
		json.put("test", restEndpoints.getTest().getBody());
		return json;
	}
}
