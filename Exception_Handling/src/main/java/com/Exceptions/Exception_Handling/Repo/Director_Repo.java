package com.Exceptions.Exception_Handling.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Exceptions.Exception_Handling.Entity.Director;

@Repository
public interface Director_Repo extends JpaRepository<Director, Integer> {

}
