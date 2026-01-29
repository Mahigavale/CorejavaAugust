package com.Amazon.Entity;

public class Company {
  
	
	String company_name;
	String gst_number;
	double turnover;
	public Company(String company_name, String gst_number, double turnover) {
		super();
		this.company_name = company_name;
		this.gst_number = gst_number;
		this.turnover = turnover;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getGst_number() {
		return gst_number;
	}
	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	
	
}
