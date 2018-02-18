package com.joyscrum.rest.jira.services;

import com.joyscrum.rest.util.Constants;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RestEndPointUser {

	public HttpResponse<String> getJiraUserMyself(String username, String password) {
		try {
			return Unirest.get(Constants.BASE_URL_JIRA+"/rest/api/2/myself")
					.basicAuth(username, password)
					.asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
