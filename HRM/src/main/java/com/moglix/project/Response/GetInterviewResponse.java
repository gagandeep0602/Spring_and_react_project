package com.moglix.project.Response;

import java.util.List;

import org.json.simple.JSONObject;

public class GetInterviewResponse {
	private List<JSONObject> interview;

	public List<JSONObject> getInterview() {
		return interview;
	}

	public void setInterview(List<JSONObject> interview) {
		this.interview = interview;
	}
 
}
