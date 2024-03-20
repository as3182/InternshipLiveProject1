package com.orane.liveproject.oraneliveproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.orane.liveproject.oraneliveproject.dao.LiveProjectDao;
import com.orane.liveproject.oraneliveproject.entity.CarEntity;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private LiveProjectDao dao ;
	
	@Override
	public CarEntity deleteByRegistrationNumber(String RegistrationNumber) {
		
		CarEntity carEntity = new CarEntity();
		Optional<CarEntity> regNo = dao.findById(RegistrationNumber);
		if(regNo.isEmpty()) {
			carEntity.setCarResgistrationNumber(RegistrationNumber);
			carEntity.setSuccess(false);
			carEntity.setMessage("Registration Number does not exist");
			return carEntity;
		}
		
		else 
		{
		dao.delete(regNo.get());
		regNo.get().setSuccess(true);
		regNo.get().setMessage("Sucessfully Deleted");
		return regNo.get();}
	}

	@Override
	public CarEntity addByRegistrationNumber(CarEntity car) {
		dao.save(car);
		car.setSuccess(true);
		car.setMessage("Registration is successful");
		return car;
	}

}
