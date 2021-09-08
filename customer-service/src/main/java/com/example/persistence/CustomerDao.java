package com.example.persistence;
import org.springframework.stereotype.Repository;

import com.example.bean.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public List<Customer> findByCustomerId(String customerId);
	
}
