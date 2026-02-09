package com.Custom.Service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.Custom.Entity.AmazonOrder;
import com.Custom.Repository.OrderRepo;



@Service
public class AmazonService {

	
	
	private  OrderRepo orderr;
	
	public AmazonService(OrderRepo orderr)
	{
		this.orderr=orderr;
	}
	
	
	
	public AmazonOrder save(AmazonOrder order)
	{
		return orderr.save(order);
	}
	
	
	
	public List<AmazonOrder> getall()
	{
		return orderr.findAll();
	}
	
	
	public  String delete(int id)
	{
		
		AmazonOrder order=orderr.findById(id).get();
		
		System.out.println(order.getOrderType()+"Is being deleted.....");
		
		orderr.deleteById(id);
		
		return "Order :"+order.getOrderPrice()+" :"+order.getOrderType()+":Deleted sucessfully";
	}
	
	public List<AmazonOrder> getbyType(String type)
	{
		
		
		List<AmazonOrder> order= orderr.getbytype(type);
		
		order.stream().forEach(System.out::println);
		
		return order;
	}
	
	

	public int updateprice(double price, int id)
	{
		int n=orderr.updatePrice(price, id);
		return n;
	}
}
