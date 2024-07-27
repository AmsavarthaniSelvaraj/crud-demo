package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).get();
	}

	public Employee setEmployee(Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);

	}

}
