package com.Exceptions.Exception_Handling.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Exceptions.Exception_Handling.Entity.Company;
@Repository
public interface Company_repo extends JpaRepository<Company, Integer> {
	

}
