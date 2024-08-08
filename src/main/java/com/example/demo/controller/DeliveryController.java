package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Delivery;
import com.example.demo.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {
	@Autowired
	private DeliveryService deliveryService;

	@PostMapping("/post")
	public String postValue(@RequestBody Delivery delivery) {
		deliveryService.addValue(delivery);
		return "Success";
	}

@GetMapping("/get")
public Page<Delivery> getValue(@RequestParam (required=false) String personName,
		@RequestParam(required = false) String address,
		@RequestParam (required = true) Integer page,
		@RequestParam(required = true) Integer size){
	return deliveryService.getValue(personName, address, page, size);
}
}
