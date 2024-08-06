package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
@Autowired
private TeacherService teacherService;

@PostMapping("/post")
public String postValue(@RequestBody Teacher teacher) {
	teacherService.addValue(teacher);
	return "Success";
}
@GetMapping("/name/{name}")
public List<Teacher> getValue(@PathVariable String name) {
	return teacherService.findValue(name);
}
@GetMapping("/number/{number}")
public List<Teacher> getVal(@PathVariable String number) {
	return teacherService.findVal(number);
}

}
