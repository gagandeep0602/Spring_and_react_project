package com.moglix.project.Response;

import java.util.List;

import org.json.simple.JSONObject;



public class GetEmployeeResponse {
	private List<JSONObject> employee;

	public List<JSONObject> getEmployee() {
		return employee;
	}

	public void setEmployee(List<JSONObject> employee) {
		this.employee = employee;
	}
	
	
}
