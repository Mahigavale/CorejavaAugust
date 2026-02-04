package com.Ecommerce.Dto;

import java.util.List;

public class UserDto {
	
	String name;
	String email;
	List<Order2> orders;
	
	
	List<Address2> addresses;
	
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
	public List<Order2> getOrders() {
		return orders;
	}
	public void setOrders(List<Order2> orders) {
		this.orders = orders;
	}
	public List<Address2> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address2> addresses) {
		this.addresses = addresses;
	}
	
	

	
}
