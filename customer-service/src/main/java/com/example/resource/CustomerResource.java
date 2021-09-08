package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Customer;
import com.example.bean.CustomerList;
import com.example.service.CustomerService;

@RestController
public class CustomerResource {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value = "/customers/{cid}")
	public CustomerList getCustomersByCustId(@PathVariable("cid") String custId) {
		CustomerList customerList=new CustomerList();
		customerList.setCustomers(customerService.getCustomersByCustomerId(custId));
		return customerList;
	}
}
