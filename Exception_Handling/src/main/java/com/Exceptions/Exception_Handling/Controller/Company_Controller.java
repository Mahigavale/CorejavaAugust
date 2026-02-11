package com.Exceptions.Exception_Handling.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.Exceptions.Exception_Handling.Entity.Company;
import com.Exceptions.Exception_Handling.Exceptions.DuplicateRequestException;
import com.Exceptions.Exception_Handling.Exceptions.NoDirectorException;
import com.Exceptions.Exception_Handling.Repo.Company_repo;
import com.Exceptions.Exception_Handling.Service.Company_service;

import jakarta.validation.Valid;

@RestController
public class Company_Controller {
	
	
	
	@Autowired
	private Company_service service;
	
	
	@Autowired
	private Company_repo repo;
	
	List<String> list=new ArrayList<String>();
	
	@PostMapping("/add-comp")
	public ResponseEntity<Company> addComp(@Valid @RequestHeader(value="key") String key,@RequestBody Company company) throws DuplicateRequestException  
	{
		if(list.contains(key))
		
		{
			throw new DuplicateRequestException("Duplicate request....");
		}
		list.add(key);
		return new ResponseEntity<Company>( service.addCompany(company), HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/get-by-id/{id}")
	public Company getComp(@PathVariable(value="id") int id) throws NoDirectorException
	{
		System.out.println(repo.findAll().size());
		if(repo.findAll().size()==0)
			
		{
			throw new NoDirectorException("EMpty List");
		}
		return service.getById(id);
	}
	

	
	
	
	@DeleteMapping("/delete-by/{id}")
	public String delete(@PathVariable("id") int id)
	{
		
		repo.deleteById(id);
		return "deleted !";
	}
	
	

}
