package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Customer;
import com.example.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> getCustomersByCustomerId(String custId) {
		
		return customerDao.findByCustomerId(custId);
	}
	
	
}
