package com.Custom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Custom.Entity.AmazonOrder;

import jakarta.transaction.Transactional;

@Repository
public interface OrderRepo extends JpaRepository<AmazonOrder, Integer> {

	
	
	@Query(value="select a  from AmazonOrder  a where a.orderType=:orderType")
	public List<AmazonOrder> getbytype( @Param(value="orderType") String type);
	
	
	@Modifying
	@Transactional
	@Query(value="update amazonorder set orderprice= :p where order_id= :o",nativeQuery=true)
	public int updatePrice(@Param(value="p") double price, @Param(value="o") int id);
	
}
