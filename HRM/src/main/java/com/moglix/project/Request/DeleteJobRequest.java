package com.moglix.project.Request;

public class DeleteJobRequest {

	private Integer jobId;

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "DeleteJobRequest [jobId=" + jobId + "]";
	}



}
