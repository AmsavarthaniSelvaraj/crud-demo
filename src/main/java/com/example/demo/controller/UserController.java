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

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/post")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "Success";
	}

	@GetMapping("/get/{id}")
	public User getId(@PathVariable int id) {
		return userService.getUser(id);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.putUser(user);
	}

	@DeleteMapping("/delete")
	public String deleteId(@PathVariable int id) {
		userService.deleteUser(id);
		return "Success";
	}

}
