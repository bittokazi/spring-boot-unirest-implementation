package com.joyscrum.rest.jira.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class RestEndpoints {
	
	public HttpResponse<String> getTest() {
		try {
			return Unirest.get("http://www.mocky.io/v2/5a8857ed30000069007f944e").asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
