package com.caching.redis_demo.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Trip_repo extends JpaRepository<Trip, Integer> {

}
