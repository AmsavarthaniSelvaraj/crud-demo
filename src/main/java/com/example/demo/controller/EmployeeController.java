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

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/post")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return "Success";
	}
	@GetMapping("/get/{id}")
	public Employee getid(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	@PutMapping("/Update")
	public Employee updateId(@RequestBody Employee employee) {
		return employeeService.setEmployee(employee);
	}
	@DeleteMapping("/Delete/{id}")
	public String deleteId(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "Success";
	}
	
	

}
