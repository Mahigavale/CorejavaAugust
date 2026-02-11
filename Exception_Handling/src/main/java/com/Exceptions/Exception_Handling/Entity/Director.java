package com.Exceptions.Exception_Handling.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Director {

	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 
	 @NotBlank(message="Name cannot be null or white spaces.....")
	 @Size(min=3, max=6,message="please follow the conventions...")
	 private String name;
	 
	 @Email
	 @Size(min=15,message="Mail needs to be longer....")
	 private String email;
	 
	 
	 @OneToOne(cascade=CascadeType.PERSIST)
	 @JoinColumn(name="company_id")
	 private Company company;


	 public int getId() {
		 return id;
	 }


	 public void setId(int id) {
		 this.id = id;
	 }


	 public String getName() {
		 return name;
	 }


	 public void setName(String name) {
		 this.name = name;
	 }


	 public String getEmail() {
		 return email;
	 }


	 public void setEmail(String email) {
		 this.email = email;
	 }


	 public Company getCompany() {
		 return company;
	 }


	 public void setCompany(Company company) {
		 this.company = company;
	 }
	 
	 
}
