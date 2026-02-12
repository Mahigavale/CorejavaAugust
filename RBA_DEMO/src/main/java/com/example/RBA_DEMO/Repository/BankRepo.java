package com.example.RBA_DEMO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RBA_DEMO.Entity.Bank;

public interface BankRepo extends JpaRepository<Bank, Integer> {

}
