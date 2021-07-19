package com.moglix.project.Service;


import com.moglix.project.Request.CreateEmployeeRequest;
import com.moglix.project.Request.DeleteEmployeeRequest;
import com.moglix.project.Response.CreateEmployeeResponse;
import com.moglix.project.Response.DeleteEmployeeResponse;
import com.moglix.project.Response.GetEmployeeResponse;
import com.moglix.project.Response.UpdateEmployeeResponse;

public interface EmployeeService {

	GetEmployeeResponse getEmployee();
    UpdateEmployeeResponse updateEmployee(CreateEmployeeRequest request);
    CreateEmployeeResponse createEmployee(CreateEmployeeRequest request);
    DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest request);
    
}
