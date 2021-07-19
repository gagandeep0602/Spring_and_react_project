package com.moglix.project.Service;

import com.moglix.project.Request.CreateTaskRequest;
import com.moglix.project.Request.DeleteTaskRequest;
import com.moglix.project.Response.DeleteTaskResponse;
import com.moglix.project.Response.GetTaskResponse;
import com.moglix.project.Response.UpdateTaskResponse;

public interface TaskService {
	GetTaskResponse getTask();
	UpdateTaskResponse updateTask(CreateTaskRequest request);
	UpdateTaskResponse createTask(CreateTaskRequest request);
	DeleteTaskResponse deleteTask(DeleteTaskRequest request);
}
