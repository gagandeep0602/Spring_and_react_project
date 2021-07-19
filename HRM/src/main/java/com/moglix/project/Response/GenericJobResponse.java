package com.moglix.project.Response;

public class GenericJobResponse {
	private  Integer code ;
	private  String message ;
	
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
	@Override
	public String toString() {
		return "GenericJobResponse [code=" + code + ", message=" + message + "]";
	}
	
	
}
