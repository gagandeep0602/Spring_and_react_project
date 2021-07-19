package com.moglix.project.Response;

import java.util.List;

import org.json.simple.JSONObject;


public class GetTaskResponse {
	private List<JSONObject> task;

	public List<JSONObject> getTask() {
		return task;
	}

	public void setTask(List<JSONObject> task) {
		this.task = task;
	}

}
