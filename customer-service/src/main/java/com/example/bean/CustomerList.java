package com.example.bean;

import java.util.List;

public class CustomerList {

	private List<Customer> customers;

	public CustomerList(){}
	
	public CustomerList(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	
}
