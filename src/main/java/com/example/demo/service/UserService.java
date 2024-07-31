package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}

	public User getUser(int id) {
		return userRepository.findById(id).get();
	}

	public User putUser(User user) {
		return userRepository.saveAndFlush(user);
	}

	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "Success";
	}

}
