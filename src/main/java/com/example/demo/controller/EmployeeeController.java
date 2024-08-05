package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employeee;
import com.example.demo.service.EmployeeeService;

@RestController
@RequestMapping("/employeee")
public class EmployeeeController {

	@Autowired
	private EmployeeeService employeeeService;
	
	@PostMapping("/post")
	public String postEmp(@RequestBody Employeee employeee) {
		employeeeService.addEmp(employeee);
		return "Success";
	}
	
	@GetMapping("/department{department}")
	public List<Employeee> getEmp(@PathVariable String department){
		return employeeeService.findDepartment(department);
	}
	@GetMapping("/name{name}")
	public List<Employeee> getName(@PathVariable String name){
		return employeeeService.findName(name);
	}
}
