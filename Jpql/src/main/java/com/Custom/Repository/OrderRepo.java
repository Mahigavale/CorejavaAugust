package com.Custom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Custom.Entity.AmazonOrder;

@Repository
public interface OrderRepo extends JpaRepository<AmazonOrder, Integer> {

	
	
	@Query(value="select a  from AmazonOrder  a where a.orderType=:orderType")
	public List<AmazonOrder> getbytype( @Param(value="orderType") String type);
	
}
