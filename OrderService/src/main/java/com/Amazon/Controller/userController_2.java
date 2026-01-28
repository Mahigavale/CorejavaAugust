package com.Amazon.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.Entity.User;

@RestController
@RequestMapping("/user2")
public class userController_2 {
	
	
	List<User> users=new ArrayList<User>();
	
	

	 
	@PostMapping("/add-name/{un}/{um}")
	public User getName(@PathVariable(value="un") String name, @PathVariable(name="um") String mobile)
	{
	                 System.out.println("name recieved:"+name);
	                 System.out.println("mobile :"+mobile);
	                 User use=new User();
	                 if(name !=null && mobile !=null)
	                 {
	                	
	                	 use.name=name;
	                	 use.mobile=mobile;
	                	     users.add(use);
	                 }
	                 
	                 System.out.println(users);
	                 return use;
	}
	
	
	@GetMapping("/get-all")
	  public List<User> getall()
	  {
		System.out.println("users:"+users);
		  return users;
	  }

	
	
	@PostMapping("/add-user")
	public String AddUser(@RequestBody User user)
	{
		
		User us=new User();
		us.mobile=user.mobile;
		us.name=user.name;
		System.out.println(us);
		return us.name;
	}
}
