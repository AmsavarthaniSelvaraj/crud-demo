package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public void saveCus(CustomerDto customer) {
		Customer obj=new Customer();
		obj.setName(customer.getName());
		customerRepository.saveAndFlush(obj);
	}
	
	public CustomerDto getCus(int id) {
		CustomerDto obj1=new CustomerDto();
		Optional<Customer>optional=customerRepository.findById(id);
		if(optional.isPresent()) {
			Customer customer=optional.get();
			obj1.setId(customer.getId());
			obj1.setName(customer.getName());
		}
		return obj1;
	}
	public List<CustomerDto> getAll(){
		List<Customer> list=customerRepository.findAll();
		List<CustomerDto> list1=new ArrayList<CustomerDto>();
		for(Customer customer : list) {
			CustomerDto obj2=new CustomerDto();
			obj2.setId(customer.getId());
			obj2.setName(customer.getName());
			list1.add(obj2);
		}
		return list1;
	}
	
	
	
	
	/*public Customer saveCus(Customer customer) {
		return customerRepository.save(customer);
	}
	public Customer getCus(int id) {
		return customerRepository.findById(id).get();
	}
	public Customer setCus(Customer customer) {
		return customerRepository.saveAndFlush(customer);
	}*/
	public void deleteCus(int id) {
	 customerRepository.deleteById(id);
	}
}
