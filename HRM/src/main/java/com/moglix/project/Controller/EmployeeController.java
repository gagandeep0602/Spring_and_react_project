package com.moglix.project.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.project.Request.CreateEmployeeRequest;
import com.moglix.project.Request.DeleteEmployeeRequest;
import com.moglix.project.Response.CreateEmployeeResponse;
import com.moglix.project.Response.DeleteEmployeeResponse;
import com.moglix.project.Response.GetEmployeeResponse;
import com.moglix.project.Response.UpdateEmployeeResponse;
import com.moglix.project.Service.EmployeeService;

@RestController
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService empService;
    
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="getEmployee", method = RequestMethod.GET, produces = "application/json")
	public GetEmployeeResponse getEmployees() {
		GetEmployeeResponse response=empService.getEmployee();
		logger.info("Fetching Employee Details");
		return response;
	}
	
	@RequestMapping(value="updateEmployee", method = RequestMethod.POST)
	public UpdateEmployeeResponse updateEmployee(@RequestBody CreateEmployeeRequest request) {
		UpdateEmployeeResponse response=empService.updateEmployee(request);
		logger.info("Updating Employee Details");
		return response;
	}

	@RequestMapping(value="createEmployee", method = RequestMethod.POST)
	public CreateEmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest request) {
		CreateEmployeeResponse response=empService.createEmployee(request);
		logger.info("Adding Employee Details");
		return response;
	}

	@RequestMapping(value="deleteEmployee", method = RequestMethod.POST)
	public DeleteEmployeeResponse deleteEmployee(@RequestBody DeleteEmployeeRequest request) {
		DeleteEmployeeResponse response=empService.deleteEmployee(request);
		logger.info("Deleting Employee Details");
		return response;
	}


}
