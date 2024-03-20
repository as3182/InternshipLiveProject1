package com.orane.liveproject.oraneliveproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CarEntity extends BaseEntity {
	
	@Id
	private String carRegistrationNumber;

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

	public void setCarResgistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public CarEntity(String carRegistrationNumber) {
		super();
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public CarEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CarEntity [carRegistrationNumber=" + carRegistrationNumber + "]";
	}
	
	

	
}
