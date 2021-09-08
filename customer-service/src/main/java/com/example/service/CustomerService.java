package com.example.service;

import java.util.List;

import com.example.bean.Customer;

public interface CustomerService {
	List<Customer> getCustomersByCustomerId(String custId);
}
