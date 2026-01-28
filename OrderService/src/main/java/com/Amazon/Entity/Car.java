package com.Amazon.Entity;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@ApplicationScope
public class Car {

	
	UUID uuid =UUID.randomUUID();
	
	public String getid()
	{
		return this.uuid+" ";
	}
	
	
	
	/**
	 * @Scope("prototype")
	 * 
	 * @RequestScope
	 * 
	 * @SessionScope
	 * 
	 */
}
