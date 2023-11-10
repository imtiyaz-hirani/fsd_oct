package com.springboot.ecomerceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ecomerceapp.model.Customer;
import com.springboot.ecomerceapp.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer postCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

}
