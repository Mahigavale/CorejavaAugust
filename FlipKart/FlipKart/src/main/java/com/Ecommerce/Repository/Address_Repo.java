package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.Address;

public interface Address_Repo extends JpaRepository<Address, Integer> {

}
