package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmpDto;
import com.example.demo.dto.ManagerDto;
import com.example.demo.entity.Emp;
import com.example.demo.entity.Manager;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerService {
	@Autowired
	private ManagerRepository managerRepository;

	public void addManager(ManagerDto manager) {
		Manager obj = new Manager();
		obj.setName(manager.getName());
		List<Emp> list = new ArrayList<Emp>();
		for (EmpDto emp : manager.getEmp()) {
			Emp obj1 = new Emp();
			obj1.setName(emp.getName());
			list.add(obj1);
		}
		obj.setEmp(list);
		managerRepository.saveAndFlush(obj);

	}

	public ManagerDto getManager(int id) {
		ManagerDto obj1 = new ManagerDto();
		Optional<Manager> optional = managerRepository.findById(id);
		Manager obj2 = optional.get();
		if (optional.isPresent()) {
			obj1.setId(obj2.getId());
			obj1.setName(obj2.getName());
			List<EmpDto> list1 = new ArrayList<EmpDto>();
			for (Emp emp : obj2.getEmp()) {
				EmpDto obj3 = new EmpDto();
				obj3.setId(emp.getId());
				obj3.setName(emp.getName());
				list1.add(obj3);
			}
		}
		return obj1;
	}

	public List<ManagerDto> getAll() {
		List<Manager> list = managerRepository.findAll();
		List<ManagerDto> list1 = new ArrayList<ManagerDto>();
		for (Manager manager : list) {
			ManagerDto obj = new ManagerDto();
			obj.setId(manager.getId());
			obj.setName(manager.getName());
			List<EmpDto> list2 = new ArrayList<EmpDto>();
			for (Emp emp : manager.getEmp()) {
				EmpDto obj1 = new EmpDto();
				obj1.setId(emp.getId());
				obj1.setName(emp.getName());
				list2.add(obj1);
			}
			obj.setEmp(list2);
			list1.add(obj);
		}
		return list1;
	}

	public void deleteManager(int id) {
		managerRepository.deleteById(id);
	}
}
