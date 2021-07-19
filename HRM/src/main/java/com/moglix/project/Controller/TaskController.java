package com.moglix.project.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.project.Request.CreateTaskRequest;
import com.moglix.project.Request.DeleteTaskRequest;
import com.moglix.project.Response.DeleteTaskResponse;
import com.moglix.project.Response.GetTaskResponse;
import com.moglix.project.Response.UpdateTaskResponse;
import com.moglix.project.Service.TaskService;

@RestController
public class TaskController {
	Logger logger = LoggerFactory.getLogger(TaskController.class);

	@Autowired
	private TaskService taskService;
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(value="getTask", method = RequestMethod.GET, produces = "application/json")
	public GetTaskResponse getTask() {
		GetTaskResponse response= taskService.getTask();
		logger.info("Fetching Task Details");
		return response;
	}
	@RequestMapping(value="updateTask", method = RequestMethod.POST)
	public UpdateTaskResponse updateTask(@RequestBody CreateTaskRequest request) {
		UpdateTaskResponse response= taskService.updateTask(request);
		logger.info("Updating Task Details");
		return response;
	}
	@RequestMapping(value="createTask", method = RequestMethod.POST)
	public UpdateTaskResponse createTask(@RequestBody CreateTaskRequest request) {
		UpdateTaskResponse response= taskService.createTask(request);
		logger.info("Assinging Task Details");
		return response;
	}
	@RequestMapping(value="deleteTask", method = RequestMethod.POST)
	public DeleteTaskResponse deleteTask(@RequestBody  DeleteTaskRequest request) {
		DeleteTaskResponse response= taskService.deleteTask(request);
		logger.info("Deleting Task Details");
		return response;
	}

}
