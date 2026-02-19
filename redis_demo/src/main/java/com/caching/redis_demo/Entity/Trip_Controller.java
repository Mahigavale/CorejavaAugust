package com.caching.redis_demo.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trip_Controller {

	@Autowired
	private Trip_repo repo;
	
	@PostMapping("/add")
	@CacheEvict(value="trips",allEntries =true)
	public Trip add(@RequestBody Trip trip) {
		return repo.save(trip);
	}
	
	@GetMapping("/get")
	@Cacheable(value="trips", key="'all'")
	public List<Trip> get() throws InterruptedException{
		System.out.println("Getting the data from the db");
		Thread.sleep(5000);
		
		return repo.findAll();
	}
	
	
	
	@GetMapping("/get-by-id/{id}")
	@Cacheable(value="gettrip", key="#id")
	public Trip getid(@PathVariable("id") int id) throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("DBBBBBBBBBBBBBBBBBBBBBBBBBB");
		return repo.findById(id).get();
	}
	
	
	@DeleteMapping("/del-by-id/{id}")
	@CacheEvict(value="trips", key="#id")
	public String delid(@PathVariable("id") int id) throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("DBBBBBBBBBBBBBBBBBBBBBBBBBB");
		 repo.deleteById(id);
		 
		 return "deleted";
		
	}
	
	@PutMapping("/update-user")
	@CachePut(value="gettrip",key="#trip.id")
	@CacheEvict(value="trips",allEntries = true)
	public Trip updateTrip(@RequestBody Trip trip)
	{
		return repo.save(trip);
	}
	
	
	
	
}
