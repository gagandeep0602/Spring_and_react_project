package com.moglix.project.Response;

import java.util.List;

import org.json.simple.JSONObject;




public class GetJobResponse {
	private List<JSONObject> jobs;

	public List<JSONObject> getJobs() {
		return jobs;
	}

	public void setJobs(List<JSONObject> jobs) {
		this.jobs = jobs;
	}
}
