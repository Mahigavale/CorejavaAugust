package com.Custom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Custom.Entity.AmazonOrder;
import com.Custom.Service.AmazonService;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class OrderController {

	
	
	@Autowired
	private  AmazonService service;
	
	
	
	@PostMapping("/add")
	public AmazonOrder addre(@RequestBody AmazonOrder order)
	{
		return service.save(order);
	}
	
	
	@GetMapping("/get-all")
	public List<AmazonOrder> getall()
	{
		return service.getall();
	}
	
	@DeleteMapping("/delete/{id}")
	public String del(@PathVariable(value="id") int id)
	{
		return  service.delete(id);
	}
	
	@GetMapping("/get-all-type/{type}")
	public List<AmazonOrder> getall(@PathVariable(value="type") String type)
	{
		return service.getbyType(type);
	}
	
}
