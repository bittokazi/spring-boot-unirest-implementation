package com.joyscrum.rest.jira.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyscrum.rest.jira.services.RestEndpoints;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class JiraUserController {
	
	RestEndpoints restEndpoints;
	
	public JiraUserController() {
		this.restEndpoints = new RestEndpoints();
	}
	
	private final Logger logger = LoggerFactory.getLogger(JiraUserController.class);
	
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
