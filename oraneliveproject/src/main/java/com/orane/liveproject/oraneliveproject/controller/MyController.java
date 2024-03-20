package com.orane.liveproject.oraneliveproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orane.liveproject.oraneliveproject.entity.CarEntity;
import com.orane.liveproject.oraneliveproject.service.CarService;

@RestController
public class MyController {
	
	@Autowired
	private CarService carService;
	
	@DeleteMapping("/DeleteRegistrationNumber/{registrationNumber}")
	private CarEntity deletebyRegistrationNumber(@PathVariable String registrationNumber)
	{
		return this.carService.deleteByRegistrationNumber(registrationNumber);
	}
	
	@PostMapping("/NewRegistration")
	private CarEntity addNewRegistrationNumber(@RequestBody CarEntity car)
	{
		return this.carService.addByRegistrationNumber(car);
	}

}
