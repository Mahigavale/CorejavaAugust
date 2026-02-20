package com.Ecommerce.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ecommerce.Dto.OrderDto;
import com.Ecommerce.Entity.Orderf;
import com.Ecommerce.Entity.User;
import com.Ecommerce.Repository.Order_Repo;


@RestController
public class OrderController {


	@Autowired
	private Order_Repo repo;
	
	@PostMapping("/add-order")
	public Orderf add(@RequestBody Orderf orderf)
	{
		return repo.save(orderf);
	}
	
	@GetMapping("/get-all-o")
	public List<OrderDto> getusers()
	{
		
		 return   repo.findAll()
		   .stream()
		   .map((order)->{
			   OrderDto o1=new OrderDto();
				  
				  o1.setContent(order.getContent());
				  o1.setPrice(order.getPrice());
				  o1.setUseremail(order.getUser().getEmail());
				  o1.setUsername(order.getUser().getName());
				  
				  o1.setPinocde(order.getAddress().getPincode());
				  o1.setState(order.getAddress().getState());
				 
				  return o1;
		   })
		   .collect(Collectors.toList());
	}
//	
//	public static OrderDto converter(Orderf order)
//	{
//		
//		  OrderDto o1=new OrderDto();
//		  
//		  o1.setContent(order.getContent());
//		  o1.setPrice(order.getPrice());
//		  o1.setUseremail(order.getUser().getEmail());
//		  o1.setUsername(order.getUser().getName());
//		 
//		  return o1;
//	}
}
