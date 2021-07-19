package com.moglix.project.Request;

public class DeleteEmployeeRequest {
	private Integer empid ;
	private String empName;
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "DeleteEmployeeRequest [empid=" + empid + ", empName=" + empName + "]";
	}


}
