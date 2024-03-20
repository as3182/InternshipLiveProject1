package com.orane.liveproject.oraneliveproject.entity;

import jakarta.persistence.Entity;

public class BaseEntity  {

	private Boolean Success;
	private String Message;
	public Boolean getSuccess() {
		return Success;
	}
	public void setSuccess(Boolean success) {
		Success = success;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public BaseEntity(String carResgistrationNumber, Boolean success, String message) {
		super();
		Success = success;
		Message = message;
	}
	public BaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseEntity(String carResgistrationNumber) {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BaseEntity [Success=" + Success + ", Message=" + Message + "]";
	}
	
	
	
}
