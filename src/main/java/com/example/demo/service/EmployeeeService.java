package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employeee;
import com.example.demo.repository.EmployeeeRepository;

@Service
public class EmployeeeService {

	@Autowired
	private EmployeeeRepository employeeeRepository;
	
	public Employeee addEmp(Employeee employeee) {
		return employeeeRepository.save(employeee);
	}
	public List<Employeee> findDepartment(String department){
		return employeeeRepository.findByDepartment(department);
	}
	public List<Employeee> findName(String name){
		return employeeeRepository.findByNameContaining(name);
	}
}
