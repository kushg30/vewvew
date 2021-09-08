package com.example.service;

import com.example.bean.CustomerDetailsList;

public interface CustomerDetailsService {

	CustomerDetailsList getCustomerDetailsById(String custId);
}
