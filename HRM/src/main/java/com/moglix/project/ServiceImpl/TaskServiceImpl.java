package com.moglix.project.ServiceImpl;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.project.Mapper.TaskMapper;
import com.moglix.project.Request.CreateTaskRequest;
import com.moglix.project.Request.DeleteTaskRequest;
import com.moglix.project.Response.DeleteTaskResponse;
import com.moglix.project.Response.GetTaskResponse;
import com.moglix.project.Response.UpdateTaskResponse;
import com.moglix.project.Service.TaskService;

@Component
public class TaskServiceImpl implements TaskService  {

	@Autowired
	private TaskMapper task;
	@Override
	public GetTaskResponse  getTask() {
		List<JSONObject> tasks;
		tasks=task.findTask();
		GetTaskResponse response=new GetTaskResponse();
		response.setTask(tasks);
		return response;
	}
	@Override
	public UpdateTaskResponse  updateTask(CreateTaskRequest request) {
		UpdateTaskResponse response=new UpdateTaskResponse();
		return response;
	}
	@Override
	public DeleteTaskResponse  deleteTask(DeleteTaskRequest request) {
		 DeleteTaskResponse response=new  DeleteTaskResponse();
		return response;
	}
	@Override
	public UpdateTaskResponse  createTask(CreateTaskRequest request) {
		UpdateTaskResponse response=new UpdateTaskResponse();
		return response;
	}
	
}
