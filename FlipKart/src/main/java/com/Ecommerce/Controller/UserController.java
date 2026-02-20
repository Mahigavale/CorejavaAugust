package com.Ecommerce.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Dto.Address2;
import com.Ecommerce.Dto.Order2;
import com.Ecommerce.Dto.UserDto;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.User_Repo;
import com.Ecommerce.Service.MailSenderService;

import jakarta.mail.MessagingException;

@RestController
public class UserController {
	
	
	@Autowired
	private User_Repo repo;
	
	
	@Autowired
	private MailSenderService service;
	
	
	@PostMapping("/add-user")
	@CacheEvict(value="users" ,allEntries=true)
	public User add(@RequestBody User user) throws MessagingException
	{
		   service.sendMessage(user);
		return repo.save(user);
	}

	
	
	@GetMapping("/get-all")
	@Cacheable(value="users",key="'all'")
	public List<UserDto> getusers() throws InterruptedException
	{
		
		System.out.println("hitting the db first....");
		
		Thread.sleep(5000);		
	        return       repo.findAll()
	             .stream()
	             .map((user)->{
	            	 UserDto dto=new UserDto();
	            	  dto.setEmail(user.getEmail());
	            	  dto.setName(user.getName());
	            	  
	            	  System.out.println("USER ID:"+user.getUserid());
	            List<Order2> o2l=user.getOrders().stream()
	            	   .map((orderf)->{
	            		   Order2 o2=new Order2();
	            		   o2.setContent(orderf.getContent());
	            		   o2.setPrice(orderf.getPrice());
	            		   return o2;
	            	   }).collect(Collectors.toList());
	            
	            List<Address2> list2=user.getAddress().stream()
	            		.map((address)->{
	            			Address2 a2=new Address2();
	            			a2.setCity(address.getCity());
	            			a2.setLandmark(address.getLandmark());
	            			a2.setLocality(address.getLocality());
	            			a2.setPincode(address.getPincode());
	            			a2.setState(address.getState());
	            			return a2;
	            		})
	            		.collect(Collectors.toList());
	            	 
	            	 dto.setOrders(o2l);
	            	 dto.setAddresses(list2);
	            	 return dto;
	             }).collect(Collectors.toList());
	}
	
	
	@PostMapping("/get-user/{id}")
	@Cacheable(value="users" ,key="#id")
	public User getId(@PathVariable("id") int id) throws InterruptedException
	{
		System.out.println("DB");
		Thread.sleep(4000);
		return repo.findById(id).get();
	}
	
	
	@PostMapping("/clear-cache")
	@CacheEvict(value="users", allEntries=true)
	public String cachecleared()
	{
		return "cache-cleared";
	}

}
