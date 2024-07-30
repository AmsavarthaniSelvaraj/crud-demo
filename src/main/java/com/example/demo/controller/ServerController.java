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

import com.example.demo.dto.ServerDto;
import com.example.demo.service.ServerService;

@RestController
@RequestMapping("/server")
public class ServerController {
	@Autowired
	private ServerService serverService;
	@PostMapping("/post")
	public String addServer(@RequestBody ServerDto server) {
		serverService.saveServer(server);
		return "Success";
	}
	@GetMapping("/get/{id}")
	public void getName(@PathVariable int id) {
		serverService.getServer(id);
}
	@GetMapping("/getAll")
	public void getAllId() {
		serverService.getAll();
	}
	@PutMapping("/update")
	public String setName(@RequestBody ServerDto server) {
		serverService.saveServer(server);
		return "Success";
	}
		@DeleteMapping("delete/{id}")
		
		public String deleteName(@PathVariable int id) {
			serverService.deleteServer(id);
			return "Success";
		}
		
		
		
		
	
}