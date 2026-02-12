package com.example.RBA_DEMO.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RBA_DEMO.Entity.Bank;
import com.example.RBA_DEMO.Entity.UserEntity;
import com.example.RBA_DEMO.Repository.BankRepo;
import com.example.RBA_DEMO.Repository.User_Repo;



@RestController
@RequestMapping()
public class BankController {


	 @Autowired
	 private BankRepo repo;
	 
	 
	 @Autowired
	 private User_Repo repo2;
	 
	 @PostMapping("/add")
	 public Bank addBank(@RequestBody Bank bank)
	 {
		 
//		 BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder(5);
//		 System.out.println(bcrypt.encode(bank.getBankname()));
		 return repo.save(bank);
	 }
	 
	 
	 @GetMapping("/get")
	 public List<Bank>getBanks()
	 {
		
		 return repo.findAll();
	 }
	 
	 @PostMapping("/addU")
	 public UserEntity addUser(@RequestBody UserEntity user)
	 {
		
		 user.getUserRoles().forEach(System.out::println);
		 
		 BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder(5);
		 
		 UserEntity us=new UserEntity();
		 us.setUserName(user.getUserName());
		 us.setUserRoles(user.getUserRoles());
		 System.out.println("password before encoding:"+user.getPassword());
		 us.setPassword(bcrypt.encode(user.getPassword()));
		 System.out.println("after:"+us.getPassword());
		
		 return repo2.save(us);
	 }
	 
	 
	 @GetMapping("/getu")
	 public List<UserEntity>getu()
	 {
		
		 return repo2.findAll();
	 }
}
