package com.Ecommerce.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Dto.Address2;
import com.Ecommerce.Dto.Order2;
import com.Ecommerce.Dto.UserDto;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.User_Repo;

@RestController
public class UserController {
	
	
	@Autowired
	private User_Repo repo;
	
	
	@PostMapping("/add-user")
	public User add(@RequestBody User user)
	{
		return repo.save(user);
	}

	
	
	@GetMapping("/get-all")
	public List<UserDto> getusers()
	{
		
	        return       repo.findAll()
	             .stream()
	             .map((user)->{
	            	 UserDto dto=new UserDto();
	            	  dto.setEmail(user.getEmail());
	            	  dto.setName(user.getName());
	            	  
	            	  
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
}
