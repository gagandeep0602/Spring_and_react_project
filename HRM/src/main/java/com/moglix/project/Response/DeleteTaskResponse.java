package com.moglix.project.Response;

public class DeleteTaskResponse {
	
	private String message ;
	private Integer code;
	private Integer taskId;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	@Override
	public String toString() {
		return "DeleteTaskResponse [message=" + message + ", code=" + code + ", taskId=" + taskId + "]";
	}

}
