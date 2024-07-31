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

import com.example.demo.service.ClientService;
import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientService clientService;

	@PostMapping("/post")
	public String postClient(@RequestBody Client client) {
		clientService.addClient(client);
		return "Success";
	}

	@GetMapping("/get/{id}")
	public Optional<Client> getId(@PathVariable int id) {
		return clientService.getClient(id);
	}

	@PutMapping("/update")
	public Client updateFile(@RequestBody Client client) {
		return clientService.putClient(client);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteId(@PathVariable int id) {
		clientService.deleteClient(id);
		return "success";
	}
}
