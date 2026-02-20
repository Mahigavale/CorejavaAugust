package com.Ecommerce.Dto;

import java.io.Serializable;

public class Order2 implements Serializable
	{
		 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		 String content;
		 double price;
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
		 
		 
	}

