package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product1;
import com.example.demo.repository.Product1Repository;

@Service
public class Product1Service {
	@Autowired
	private Product1Repository product1Repository;
	
	public Product1 addValue(Product1 product1) {
	return product1Repository.save(product1);		
	}
	public Page<Product1> getValue(int page,int size){
		Pageable pageable=PageRequest.of(page, size);
		return product1Repository.findAll(pageable);
	}
}
             