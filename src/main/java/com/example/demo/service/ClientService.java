package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;

	public Client addClient(Client client) {
		return clientRepository.save(client);
	}

	public Optional<Client> getClient(int id) {
		return clientRepository.findById(id);
	}

	public Client putClient(Client client) {
		return clientRepository.saveAndFlush(client);
	}

	public void deleteClient(int id) {
		clientRepository.deleteById(id);
	}

}
