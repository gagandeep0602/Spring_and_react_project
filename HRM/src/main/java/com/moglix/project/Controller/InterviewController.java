package com.moglix.project.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.project.Response.GetInterviewResponse;
import com.moglix.project.Response.GetJobResponse;
import com.moglix.project.Service.InterviewService;
import com.moglix.project.Service.JobService;

@RestController
public class InterviewController {
	Logger logger = LoggerFactory.getLogger(InterviewController.class);
	@Autowired
	private InterviewService interviewService;
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="getInterviews", method = RequestMethod.GET, produces = "application/json")
	public GetInterviewResponse getInterview() {
		GetInterviewResponse response= interviewService.getInterviews();
		logger.info("Interviews Details");
		return response;
	}
}
