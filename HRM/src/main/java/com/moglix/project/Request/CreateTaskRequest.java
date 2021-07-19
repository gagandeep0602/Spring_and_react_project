package com.moglix.project.Request;

public class CreateTaskRequest {

	private Integer empId;
	private String empName;
	private String departmentName;
	private String reportingManager;
	private Integer taskId;
	private String taskDescription;
	private String status;
	private String taskPriority;
	private String dueDate;

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTaskPriority() {
		return taskPriority;
	}
	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "CreateTaskRequest [empId=" + empId + ", empName=" + empName + ", departmentName=" + departmentName
				+ ", reportingManager=" + reportingManager + ", taskId=" + taskId + ", taskDescription="
				+ taskDescription + ", status=" + status + ", taskPriority=" + taskPriority + ", dueDate=" + dueDate
				+ "]";
	}

}
