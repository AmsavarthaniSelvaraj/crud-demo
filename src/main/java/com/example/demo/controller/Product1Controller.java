package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product1;
import com.example.demo.service.Product1Service;

@RestController
@RequestMapping("/product1")
public class Product1Controller {
	@Autowired
	private Product1Service product1Service;
	
	@PostMapping("/post")
	public String postValue(@RequestBody Product1 product1) {
		product1Service.addValue(product1);
		return "Success";
	}
    @GetMapping("/get/{page}/{size}")
    public Page<Product1> getValues(@PathVariable int page,@PathVariable int size){
    	return product1Service.getValue(page, size);
}}
