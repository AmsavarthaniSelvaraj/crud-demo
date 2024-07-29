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

import com.example.demo.entity.Bus;
import com.example.demo.service.BusService;

@RestController
@RequestMapping ("/bus")
public class BusController {
	@Autowired
	private BusService busService;
	
	@PostMapping("/post")
	public String addBus(@RequestBody Bus bus) {
		try {
			busService.saveBus(bus);
			return "Success";
		} catch (Exception e){
			return "Having Exception";
		}
	}
	@GetMapping("/get/{id}")
  public Object getid(@PathVariable int id) {
		try {
			return busService.getBus(id);
		} catch (Exception e) {
			return "Exception";
		}
	}
	@PutMapping("/update")
	public Object updateId(@RequestBody Bus bus) {
		try {
			return busService.setBus(bus);
		} catch (Exception e){
			return "E";
		}
	}
	@DeleteMapping("/delete/{id}")
	public String deleteId(@PathVariable int id) {
		try {
			busService.deleteBus(id);
			return "Success";
		} catch(Exception e) {
			return "Not success";
		}
	}
	
	
}
