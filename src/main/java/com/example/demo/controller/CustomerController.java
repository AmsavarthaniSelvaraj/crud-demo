package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/post")
	public String addCus(@RequestBody Customer customer) {
		customerService.saveCus(customer);
		return "Success";
	}
	@GetMapping("/get/{id}")
	public Customer getId(@PathVariable int id) {
	return customerService.getCus(id);
	}
	@PutMapping("/Update")
	public Customer updateCus(@RequestBody Customer customer) {
		return customerService.setCus(customer);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCus(@PathVariable int id) {
		customerService.deleteCus(id);
		return "Success";
	}
}
