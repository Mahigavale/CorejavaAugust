package com.Amazon.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	User user=new User();
	@GetMapping("/create")
	public String getUser()
	{
		
		user.mobile="000000000";
		user.name="abcdef";
		return  user.toString();
	}
	
	
	@PostMapping("/addname")
	public String addname( @RequestParam (value="demo",required=true)Integer[] name)
	{
	
    
		List<Integer> list=Arrays.asList(name);
		int sum=	list.stream().reduce(0,(i,j)->(i+j));
			
			return Integer.valueOf(sum).toString();
		
	}
}


class User
{
	String name;
	String mobile;
	
	public String toString()
	{
		return this.name+this.mobile;
	}
}