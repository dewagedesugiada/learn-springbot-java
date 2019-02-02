package com.sti.lending.service.dto;

public class CommonResponse<T> {
	
	private String status;
	private String message;
	private T values;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getValues() {
		return values;
	}
	public void setValues(T values) {
		this.values = values;
	}
	
	
	
	
	

	
}
