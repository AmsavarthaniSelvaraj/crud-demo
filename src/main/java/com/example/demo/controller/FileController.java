package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.File;
import com.example.demo.service.FileService;

@RestController

@RequestMapping("/file")
public class FileController {
	@Autowired
	private FileService fileService;

	@PostMapping("/post")
	public String postFile(@RequestBody File file) {
		fileService.addFile(file);
		return "Success";
	}

	@GetMapping("/get/{id}")
	public Optional<File> getId(@PathVariable int id) {
		return fileService.getFile(id);
	}

	@PutMapping("/update")
	public File updateFile(@RequestBody File file) {
		return fileService.putFile(file);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteId(@PathVariable int id) {
		fileService.deleteFile(id);
		return "success";
	}
}
