package com.Exceptions.Exception_Handling.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Exceptions.Exception_Handling.Entity.Director;
import com.Exceptions.Exception_Handling.Repo.Director_Repo;

@Service
public class Director_Service {

	
	 @Autowired
	 private Director_Repo repo;
	 
	 
	 
	 
	 public Director addDirector(Director director)
	 {
		 return repo.save(director);
	 }
	 
	 
	 
	 public List<Director> FindallDirector()
	 {
		 return repo.findAll();
	 }
}
