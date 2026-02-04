package com.Ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ecommerce.Entity.User;

public interface User_Repo extends JpaRepository<User, Integer> {

}
