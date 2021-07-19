package com.moglix.project.Request;

public class DeleteTaskRequest {
	private Integer taskId;

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	@Override
	public String toString() {
		return "DeleteTaskRequest [taskId=" + taskId + "]";
	}

}
