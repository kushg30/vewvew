package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.bean.Customer;
import com.example.bean.CustomerDetails;
import com.example.bean.CustomerDetailsList;
import com.example.bean.CustomerList;
import com.example.bean.Share;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public CustomerDetailsList getCustomerDetailsById(String custId) {
		
		List<CustomerDetails> customerDetailsCollection=new ArrayList<>();
		
		CustomerList customerList=restTemplate.getForObject("http://localhost:8084/customers/"+custId, CustomerList.class);
		
		for(Customer customer:customerList.getCustomers()) {
			
			Share share=restTemplate.getForObject("http://localhost:8082/shares/"+customer.getShareId(), Share.class);
			
			CustomerDetails customerDetails=new CustomerDetails(customer.getCustomerId(), share.getShareName(), 
					customer.getQuantity(), share.getMarketPrice(), 
					customer.getQuantity()*share.getMarketPrice(), customer.getShareType());
		
			customerDetailsCollection.add(customerDetails);
		}
		
		CustomerDetailsList customerDetailsList=new CustomerDetailsList(customerDetailsCollection);
		
		return customerDetailsList;
	}

}
