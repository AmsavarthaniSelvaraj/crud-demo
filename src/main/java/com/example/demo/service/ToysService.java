package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Toys;
import com.example.demo.repository.ToysRepository;

@Service
public class ToysService {
	@Autowired
	private ToysRepository toysRepository;

	public Toys addValue(Toys toys) {
		return toysRepository.save(toys);
	}

	public Optional<Toys> getValue(int id) {
		return toysRepository.findById(id);
	}

	public Toys putValue(Toys toys) {
		return toysRepository.saveAndFlush(toys);
	}

	public void deleteValue(int id) {
		toysRepository.deleteById(id);
	}

	public Page<Toys> getToys(String name, String color, Double price, String shopName, Integer page, Integer size) {
		Pageable pageable = PageRequest.of(page, size);
		return toysRepository.findByNameContaining(name, color, price, shopName, pageable);
	}
}
