package com.example.RBA_DEMO.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.RBA_DEMO.Entity.UserEntity;
import com.example.RBA_DEMO.Repository.User_Repo;

@Service
public class myUserDetailsService implements UserDetailsService {

	@Autowired
	private User_Repo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		               UserEntity user=repo.getUser(username);
		               
		               return new myUserPrincipal(user);
	}

}
