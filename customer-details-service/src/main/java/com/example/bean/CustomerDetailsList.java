package com.example.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDetailsList {

	List<CustomerDetails> customersDetails;

	public CustomerDetailsList() {}
	
	public CustomerDetailsList(List<CustomerDetails> customersDetails) {
		super();
		this.customersDetails = customersDetails;
	}

	public List<CustomerDetails> getCustomersDetails() {
		return customersDetails;
	}

	public void setCustomersDetails(List<CustomerDetails> customersDetails) {
		this.customersDetails = customersDetails;
	}
	
	
}
