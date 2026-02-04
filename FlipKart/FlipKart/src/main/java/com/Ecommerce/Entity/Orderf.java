package com.Ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Orderf {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int orderid;
	String content;
	double price;
	
	
	
	
	@JoinColumn
	@ManyToOne
	private User user;
	
	
	@OneToOne
	@JoinColumn
	private Address address;
	
	
	
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
}
