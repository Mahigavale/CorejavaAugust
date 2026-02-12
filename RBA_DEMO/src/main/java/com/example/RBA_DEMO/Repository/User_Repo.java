package com.example.RBA_DEMO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.RBA_DEMO.Entity.UserEntity;

public interface User_Repo extends JpaRepository<UserEntity, Integer> {

	@Query(value="select * from user_entity where user_name= :nm;",nativeQuery=true)
	public UserEntity getUser(@Param(value="nm") String nm);
}
