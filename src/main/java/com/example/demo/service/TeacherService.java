package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository teacherRepository;
	
    public Teacher addValue(Teacher teacher) {
    	return teacherRepository.save(teacher);
    }
    public List<Teacher> findValue(String name){
    	return teacherRepository.findByName(name);
    }
    public List<Teacher> findVal(String number){
    	return teacherRepository.findByNumberContaining(number);
    }
}
