package com.moglix.project.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.project.Mapper.JobsMapper;

import com.moglix.project.Request.CreateJobRequest;
import com.moglix.project.Request.DeleteJobRequest;
import com.moglix.project.Response.GenericJobResponse;
import com.moglix.project.Response.GetJobResponse;
import com.moglix.project.Service.JobService;

@Component
public class JobServiceImpl implements JobService {
	@Autowired
	private JobsMapper job;
	
	@Override
	public GetJobResponse getJobs() {
		List<JSONObject> jobs;
		jobs=job.findJob();
		GetJobResponse response=new  GetJobResponse();
		response.setJobs(jobs);
		return response;
	}

	@Override
	public GenericJobResponse deleteJobs(DeleteJobRequest request) {
		GenericJobResponse response=new  GenericJobResponse();
		return response;
	}

	@Override
	public GenericJobResponse createJobs(CreateJobRequest request) {
		GenericJobResponse response=new  GenericJobResponse();
		return response;
	}

	@Override
	public GenericJobResponse updateJobs(CreateJobRequest request) {
		GenericJobResponse response=new  GenericJobResponse();
		return response;
	}
}
