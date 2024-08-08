package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Delivery;
import com.example.demo.repository.DeliveryRepository;

@Service
public class DeliveryService {
	@Autowired
	private DeliveryRepository deliveryRepository;

	public Delivery addValue(Delivery delivery) {
		return deliveryRepository.save(delivery);
	}

	public Page<Delivery> getValue(String personName,String address,Integer page,Integer size){
		Pageable pageable=PageRequest.of(page, size);
		return deliveryRepository.findByNameContaining(personName,address,pageable);
	}

}
