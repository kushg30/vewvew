package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.CustomerDetailsList;
import com.example.service.CustomerDetailsService;

@RestController
public class CustomerDetailsResource {

	@Autowired
	CustomerDetailsService customerDetailsService;
	
	@GetMapping(value = "/customerdetails/{cid}",produces = "application/json")
	public CustomerDetailsList getCustomerDetailsByCustId(@PathVariable("cid") String customerId) {
		return customerDetailsService.getCustomerDetailsById(customerId);
	}
}
