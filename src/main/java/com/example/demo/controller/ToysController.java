package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Toys;
import com.example.demo.service.ToysService;

@RestController
@RequestMapping("/toys")
public class ToysController {
	@Autowired
	private ToysService toysService;
	
	@PostMapping("/post")
	public String postValue(@RequestBody Toys toys) {
		toysService.addValue(toys);
		return "Success";
	}
	@GetMapping("/get/{id}")
	public Optional<Toys> getValue(@PathVariable int id){
	return toysService.getValue(id);
   }
	@PutMapping("/update")
	public Toys updateValue(@RequestBody Toys toys) {
		return toysService.putValue(toys);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteValue(@PathVariable int id) {
		toysService.deleteValue(id);
		return "Success";
	}

	@GetMapping("/get")
	public Page<Toys> getByValue(@RequestParam(required = false) String name,
			@RequestParam(required = false) String color, @RequestParam(required = false) Double price,
			@RequestParam(required = false) String shopName,
			@RequestParam(required = true) Integer page,
			@RequestParam(required = true) Integer size){ 
		   return toysService.getToys(name, color, price, shopName, page, size);
	}

	
	}
