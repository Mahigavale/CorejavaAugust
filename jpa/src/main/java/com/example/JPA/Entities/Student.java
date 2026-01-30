package com.example.JPA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int sId;
	String city;
	String sName;
	
	

}
