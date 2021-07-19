package com.moglix.project.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.project.Request.CreateJobRequest;
import com.moglix.project.Request.DeleteJobRequest;
import com.moglix.project.Response.GenericJobResponse;
import com.moglix.project.Response.GetJobResponse;
import com.moglix.project.Service.JobService;

@RestController
public class JobController {
	Logger logger = LoggerFactory.getLogger(JobController.class);

	@Autowired
	private JobService jobService;
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="getJobs", method = RequestMethod.GET, produces = "application/json")
	public GetJobResponse getJob() {
		GetJobResponse response= jobService.getJobs();
		logger.info("Job Openings Details");
		return response;
	}

	@RequestMapping(value="deleteJobs", method = RequestMethod.POST)
	public GenericJobResponse deleteJob(@RequestBody DeleteJobRequest request) {
		GenericJobResponse response= jobService.deleteJobs(request);
		logger.info("Deleting Job  Opening");
		return response;
	}

	@RequestMapping(value="createJobs", method = RequestMethod.POST)
	public GenericJobResponse createJob(@RequestBody CreateJobRequest request) {
		GenericJobResponse response= jobService.createJobs(request);
		logger.info("Creating  Job  Opening");
		return response;
	}

	@RequestMapping(value="updateJobs", method = RequestMethod.POST)
	public GenericJobResponse updateJob(@RequestBody CreateJobRequest request) {
		GenericJobResponse response= jobService.updateJobs(request);
		logger.info("Updating  Job  Opening");
		return response;
	}



}
