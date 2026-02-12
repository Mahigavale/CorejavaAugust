package com.example.RBA_DEMO.Config;

import java.nio.file.attribute.UserPrincipal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.RBA_DEMO.Entity.UserEntity;

public class myUserPrincipal  implements UserDetails{

	private  UserEntity user;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		  List<SimpleGrantedAuthority>   list= user.getUserRoles().stream()
		     .map((role)->(new SimpleGrantedAuthority(role))).collect(Collectors.toList());
		  return list;
	}

	@Override
	public @Nullable String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUserName();
	}

	
	public myUserPrincipal(UserEntity user)
	{
		this.user=user;
	}
}
