package com.Ecommerce.Dto;
import com.Ecommerce.Entity.Orderf;

public class OrderDto {
	
	  String content;
	  double price;
	  String username;
	  String useremail;
	  
	  
	  String pinocde;
	  String state;
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

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	
	
	
	public String getPinocde() {
		return pinocde;
	}
	public void setPinocde(String pinocde) {
		this.pinocde = pinocde;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public static OrderDto converter(Orderf order)
	{
		
		  OrderDto o1=new OrderDto();
		  
		  o1.setContent(order.getContent());
		  o1.setPrice(order.getPrice());
		  o1.setUseremail(order.getUser().getEmail());
		  o1.setUsername(order.getUser().getName());
		 
		  return o1;
	}
	
}
