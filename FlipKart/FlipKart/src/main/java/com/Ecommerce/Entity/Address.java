package com.Ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addid;
	String city;
	String pincode;
	String state;
	String locality;
	String landmark;
	
	
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user;



	public int getAddid() {
		return addid;
	}



	public void setAddid(int addid) {
		this.addid = addid;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPincode() {
		return pincode;
	}



	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getLocality() {
		return locality;
	}



	public void setLocality(String locality) {
		this.locality = locality;
	}



	public String getLandmark() {
		return landmark;
	}



	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
