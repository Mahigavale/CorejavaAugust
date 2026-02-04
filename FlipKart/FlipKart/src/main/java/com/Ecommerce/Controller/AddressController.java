package com.Ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Entity.Address;
import com.Ecommerce.Repository.Address_Repo;

@RestController
public class AddressController {

	
	@Autowired
	private Address_Repo repo;
	
	
	
	@PostMapping("/add-add")
	public Address addadd(@RequestBody Address add)
	{
	 return 	repo.save(add);
	}
	
	@GetMapping("/get-add")
	public List<Address> getall()
	{
		 return repo.findAll();
	}
	
}
