package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.Orderf;

public interface Order_Repo extends JpaRepository<Orderf, Integer> {

}
