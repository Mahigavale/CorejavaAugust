package com.example.RBA_DEMO.Config;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration
public class Mysecurity {

	@Autowired
	private myUserDetailsService userd;
	
	@Bean
	 public  SecurityFilterChain mysecure(HttpSecurity http)
	 {
		
		 return  http.csrf((i)->{i.disable();})
		 .authorizeHttpRequests((req)->{
			 
			 req.requestMatchers(HttpMethod.POST).permitAll()
			 .requestMatchers(HttpMethod.GET).hasAnyAuthority("ADMIN")
			 
			 .anyRequest().authenticated();
		 }).httpBasic(Customizer.withDefaults())
		 .build();
	 }
	
	
//	@Bean
//	public UserDetailsService myusers()
//	{
//		List<SimpleGrantedAuthority> list=new ArrayList<SimpleGrantedAuthority>();
//		list.add(new SimpleGrantedAuthority("USER"));
//		User atharva=new User("AAA","{noop}AAA@123", list);
//		
//		
//		List<SimpleGrantedAuthority> list2=new ArrayList<SimpleGrantedAuthority>();
//		list2.add(new SimpleGrantedAuthority("USER"));
//		list2.add(new SimpleGrantedAuthority("ADMIN"));
//		User raj=new User("BBB","{noop}BBB@123", list2);
//		//UserDetails user1=User.builder().username("ABC").password("AAA@123").build();
//		
//		return new InMemoryUserDetailsManager(atharva,raj);
//	}
	
	
	@Bean
	public DaoAuthenticationProvider myauth()
	{
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider(userd);
		
		provider.setPasswordEncoder(new BCryptPasswordEncoder(5));
		
		return provider;
	}
}
