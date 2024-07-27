package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCus(Customer customer) {
		return customerRepository.save(customer);
	}
	public Customer getCus(int id) {
		return customerRepository.findById(id).get();
	}
	public Customer setCus(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}
	public void deleteCus(int id) {
	 customerRepository.deleteById(id);
	}
}
