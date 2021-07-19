package com.moglix.project.ServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.json.simple.JSONObject;

import com.moglix.project.Mapper.EmployeeMapper;

import com.moglix.project.Request.CreateEmployeeRequest;
import com.moglix.project.Request.DeleteEmployeeRequest;
import com.moglix.project.Response.CreateEmployeeResponse;
import com.moglix.project.Response.DeleteEmployeeResponse;
import com.moglix.project.Response.GetEmployeeResponse;
import com.moglix.project.Response.UpdateEmployeeResponse;
import com.moglix.project.Service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    private EmployeeMapper employee;

	@Override
	public GetEmployeeResponse getEmployee() {
		List<JSONObject> emp;
		emp=employee.findEmployee();
		GetEmployeeResponse response=new  GetEmployeeResponse();
		response.setEmployee(emp);
		return response;
	}

	@Override
	public UpdateEmployeeResponse updateEmployee(CreateEmployeeRequest request) {
		UpdateEmployeeResponse response=new UpdateEmployeeResponse();
		return response;
	}

	@Override
	public CreateEmployeeResponse createEmployee(CreateEmployeeRequest request) {
		CreateEmployeeResponse response=new CreateEmployeeResponse();
		return response;
	}
	
	@Override
	public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request) {
		DeleteEmployeeResponse response=new DeleteEmployeeResponse();
		return response;
	}
}

