package com.Exceptions.Exception_Handling.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.Exceptions.Exception_Handling.Entity.Director;
import com.Exceptions.Exception_Handling.Exceptions.NoDirectorException;
import com.Exceptions.Exception_Handling.Repo.Director_Repo;
import com.Exceptions.Exception_Handling.Service.Director_Service;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
import jakarta.validation.Valid;

@RestController
public class Director_Controller {

	
	@Autowired
	private  Director_Service service;
	
	@Autowired
	private Director_Repo repo;
	
	
	
	@PostMapping("/add-dir")
	public  ResponseEntity<Director> addDirector( @Valid @RequestBody Director director)
	{
		  return new ResponseEntity<Director>(service.addDirector(director), HttpStatus.CREATED);
	}
	
	@GetMapping("/get-dir")
	@Transactional(rollbackOn=NoDirectorException.class,value=TxType.REQUIRED)
	public  ResponseEntity<List<Director>> addDirector() throws NoDirectorException
	{
	 if(	service.FindallDirector().size()==0)
	 {
		 throw new NoDirectorException("Empty List");
	 }
		  return new ResponseEntity<List<Director>>(service.FindallDirector(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete-by/d/{id}")
	public String delete(@PathVariable("id") int id)
	{
		
		repo.deleteById(id);
		return "deleted !";
	}
	
	
	
}
