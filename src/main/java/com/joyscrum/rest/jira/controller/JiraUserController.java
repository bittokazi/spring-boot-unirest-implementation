package com.joyscrum.rest.jira.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyscrum.rest.jira.services.RestEndPointUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class JiraUserController {
	
	RestEndPointUser restEndpointsUser;
	
	public JiraUserController() {
		this.restEndpointsUser = new RestEndPointUser();
	}
	
	private final Logger logger = LoggerFactory.getLogger(JiraUserController.class);
	
	@GetMapping("/rest/jira/user/myself")
	public Map<String, Object> healthCheck(HttpServletRequest req) {
		Map<String, Object> json = new HashMap<>();
		json.put("jiraUser", restEndpointsUser.getJiraUserMyself("username", "password").getBody());
		return json;
	}
}
