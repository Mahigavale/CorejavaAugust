package com.example.RBA_DEMO.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addid;
	private String city;
	private String pincode;
	private String state;
	
	
	@OneToOne
	@JoinColumn(name="bid")
	private Bank bank;


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


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	
	
}

