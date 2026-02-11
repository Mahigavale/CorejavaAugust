package com.Exceptions.Exception_Handling.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Exceptions.Exception_Handling.Entity.Company;
import com.Exceptions.Exception_Handling.Repo.Company_repo;

@Service
public class Company_service {

	
	@Autowired
	private Company_repo repo;
	
	
	
	
	public Company addCompany(Company comp)
	{
		
		return repo.save(comp);
	}
	
	
	public  Company getById(int id)
	{
		
		return repo.findById(id).get();
	}
}
