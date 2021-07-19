package com.moglix.project.Request;

public class CreateJobRequest {

	private Integer jobId;
	private String jobTitle;
	private String location;
	private String experience;
	private String role;
	
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "CreateJobRequest [jobId=" + jobId + ", jobTitle=" + jobTitle + ", location=" + location
				+ ", experience=" + experience + ", role=" + role + "]";
	}
	
	

}
