package com.Ecommerce.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userid;
	String name;
	String email;
	
	
	
	@OneToMany(mappedBy="user")
	private List<Orderf> orders;
	
	
	@OneToMany(mappedBy="user")
	private List<Address> address;
	
	

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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public List<Orderf> getOrders() {
		return orders;
	}
	public void setOrders(List<Orderf> orders) {
		this.orders = orders;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
}
