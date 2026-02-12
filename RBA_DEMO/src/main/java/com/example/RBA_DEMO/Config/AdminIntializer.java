package com.example.RBA_DEMO.Config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.RBA_DEMO.Entity.UserEntity;
import com.example.RBA_DEMO.Repository.User_Repo;

@Component
public class AdminIntializer implements CommandLineRunner {

	
	@Autowired
	private User_Repo repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		List<UserEntity> users=repo.findAll();
		
		//System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		//users.stream().forEach(System.out::println);
		if(users.size()==0)
		{
			System.out.println("NO ADMIN found adding the default one....");
			 UserEntity user=new UserEntity();
			 user.setPassword(new BCryptPasswordEncoder(5).encode("ABC@123"));
			 user.setUserName("ADMIN_USER");
			 user.setUserRoles(Arrays.asList("ADMIN","USER","SUPER_ADMIN"));
			 System.out.println("ADMIN added with name:"+user.getUserName());
			 
			 repo.save(user);
		}
		else {
			
	 List<List<String>>list=	users.stream().map((i)->(i.getUserRoles())).collect(Collectors.toList());
	// System.out.println(list);
	 
	 
	 List<String> list3=  list.stream().flatMap((i)->(i.stream())).collect(Collectors.toList());
	 
	// System.out.println(list3);
	 
	 if(list3.contains("ADMIN"))
	 {
		 System.out.println("ADMIN already there ... no need to add !");
	 }
	 else
	 {
		 System.out.println("NO ADMIN found adding the default one....");
		 UserEntity user=new UserEntity();
		 user.setPassword(new BCryptPasswordEncoder(5).encode("ABC@123"));
		 user.setUserName("ADMIN_USER");
		 user.setUserRoles(Arrays.asList("ADMIN","USER","SUPER_ADMIN"));
		 System.out.println("ADMIN added with name:"+user.getUserName());
		 
		 repo.save(user);
	 }
		//System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		}

	} 

}
