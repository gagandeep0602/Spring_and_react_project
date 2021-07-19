package com.moglix.project.Response;

public class DeleteEmployeeResponse {

	private  Integer code ;
	private  String message ;

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "DeleteEmployeeResponse [code=" + code + ", message=" + message + "]";
	}



}
