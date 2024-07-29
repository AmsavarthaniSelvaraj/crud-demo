package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bus;
import com.example.demo.repository.BusRepository;

@Service
public class BusService {
	
	@Autowired
	private BusRepository busRepository;
	
	public Bus saveBus(Bus bus) {
		return busRepository.save(bus);
	}
	public Bus getBus(int id) {
		return busRepository.findById(id).get();
	}
	public Bus setBus(Bus bus) {
		return busRepository.saveAndFlush(bus);
	}
	public void deleteBus(int id) {
		busRepository.deleteById(id);	
	}
}
