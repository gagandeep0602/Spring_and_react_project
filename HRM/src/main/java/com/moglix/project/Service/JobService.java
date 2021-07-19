package com.moglix.project.Service;

import com.moglix.project.Request.CreateJobRequest;
import com.moglix.project.Request.DeleteJobRequest;
import com.moglix.project.Response.GenericJobResponse;
import com.moglix.project.Response.GetJobResponse;

public interface JobService {

	GetJobResponse getJobs();
	GenericJobResponse deleteJobs(DeleteJobRequest request);
	GenericJobResponse createJobs(CreateJobRequest request);
	GenericJobResponse updateJobs(CreateJobRequest request);

}
