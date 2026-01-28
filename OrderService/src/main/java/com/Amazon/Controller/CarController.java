package com.Amazon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.Entity.Car;

@RestController
public class CarController {

	
	@Autowired
	private Car car;
	
	@GetMapping("/get-id")
	public String getId()
	{
		 return car.getid();
	}
}
