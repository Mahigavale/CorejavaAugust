package com.Custom.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.Custom.Entity.AmazonOrder;
import com.Custom.Repository.OrderRepo;
import com.Custom.Service.AmazonService;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class OrderController {

	
	
	@Autowired
	private  AmazonService service;
	
	
	
	@Autowired
	private OrderRepo repo;
	
	
	List<String> keys=new ArrayList<String>();
	
	@PostMapping("/add")
	public AmazonOrder addre(@RequestBody AmazonOrder order, @RequestHeader(value="key") String key) throws Exception
	{
		
		
		System.out.println(key);
	 System.out.println(keys.contains(key));
	 System.out.println(keys);
		 if(keys.contains(key))
		 {

     throw new Exception("DUPLICATE REQUEST!");		 }
		 
				 
		
			System.out.println("This is the adder method for adding a source. Non-idempotent by default....");
			keys.add(key);
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
		System.out.println("calling the delete the method of the repo..... ");
		System.out.println("recieved the id:"+id);
		
		return  service.delete(id);
	}
	
	@GetMapping("/get-all-type/{type}")
	public List<AmazonOrder> getall(@PathVariable(value="type") String type)
	{
		System.out.println("calling the service");
		return service.getbyType(type);
	}
	
	
	@PutMapping("/updateprice/{price}/{id}")
	public int updatePrice(@PathVariable(value="price") double price, @PathVariable(value="id") int id)
	{
		return service.updateprice(price, id);

	}
}
