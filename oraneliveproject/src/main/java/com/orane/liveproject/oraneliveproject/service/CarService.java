package com.orane.liveproject.oraneliveproject.service;

import com.orane.liveproject.oraneliveproject.entity.CarEntity;

public interface CarService {
	
	public CarEntity deleteByRegistrationNumber(String RegistrationNumber) ;
	public CarEntity addByRegistrationNumber(CarEntity car);

}
