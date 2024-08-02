package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ManagerDto;
import com.example.demo.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {
	@Autowired
	private ManagerService managerService;
	
	@PostMapping("/post")
	public String postManager(@RequestBody ManagerDto manager) {
		managerService.addManager(manager);
		return "Success";
	}
	
	@GetMapping("/get/{id}")
	public ManagerDto getManager(@PathVariable int id) {
		return managerService.getManager(id);
		
	}
	@GetMapping("/getAll")
	public List<ManagerDto> getAll() {
		return managerService.getAll();
	}
	@PutMapping("/update")
	public String updateManager(@RequestBody ManagerDto manager) {
		managerService.addManager(manager);
		return "Success";
}
	@DeleteMapping("/delete/{id}")
	public String deleteManager(@PathVariable int id) {
		managerService.deleteManager(id);
		return "Success";
	}}
