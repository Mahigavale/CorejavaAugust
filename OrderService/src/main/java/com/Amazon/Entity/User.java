package com.Amazon.Entity;

import org.springframework.stereotype.Component;


public class User {
	 public String name;
	 public String mobile;
	
	public String toString()
	{
		return this.name+" "+this.mobile;
	}
}
