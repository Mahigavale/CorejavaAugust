package com.Amazon.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.Entity.Car;
import com.Amazon.Entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	/**
	 * <dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.6</version>
</dependency>


http://localhost:8080/swagger-ui/index.html


	 */
	
	@Autowired
	private Car car;
	
	
	
	
	User user=new User();
	@GetMapping("/create")
	public String getUser()
	{
		
		user.mobile="000000000";
		user.name="abcdef";
		
		System.out.println();
		
		return  user.toString();
	}
	
	
	@PostMapping("/addname")
	public String addname( @RequestParam (value="demo",required=true)Integer[] name)
	{
	
    
		List<Integer> list=Arrays.asList(name);
		int sum=	list.stream().reduce(0,(i,j)->(i+j));
			
			return Integer.valueOf(sum).toString();
		
	}
	@GetMapping("/get-id")
	public String getId()
	{
		 return car.getid();
	}
}


