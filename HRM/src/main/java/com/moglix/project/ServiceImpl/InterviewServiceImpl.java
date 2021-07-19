package com.moglix.project.ServiceImpl;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.project.Mapper.EmployeeMapper;
import com.moglix.project.Mapper.InterviewMapper;
import com.moglix.project.Response.GetEmployeeResponse;
import com.moglix.project.Response.GetInterviewResponse;
import com.moglix.project.Service.InterviewService;

@Component
public class InterviewServiceImpl implements InterviewService {
	@Autowired
    private InterviewMapper inter;

	@Override
	public GetInterviewResponse getInterviews() {
		List<JSONObject> interview;
		interview=inter.findInterview();
		GetInterviewResponse response=new  GetInterviewResponse();
		response.setInterview(interview);
		return response;
	}
}
