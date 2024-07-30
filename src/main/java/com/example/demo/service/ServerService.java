package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ServerDto;
import com.example.demo.entity.Server;
import com.example.demo.repository.ServerRepository;

@Service
public class ServerService {
	@Autowired
	private ServerRepository serverRepository;
	
	public void saveServer(ServerDto server) {
		Server obj=new Server();
	obj.setAge(server.getAge());
	obj.setAddress(server.getAddress());
	serverRepository.saveAndFlush(obj);
	}

	public ServerDto getServer(int id) {
		ServerDto obj1=new ServerDto();
		Optional<Server>obj2=serverRepository.findById(id);
		if(obj2.isPresent()) {
			Server obj3 = obj2.get();
			obj1.setId(obj3.getId());
			obj1.setAge(obj3.getAge());
			obj1.setAddress(obj3.getAddress());
		}
		return obj1;
	}
	
	public List<ServerDto> getAll(){
		List<Server> list=serverRepository.findAll();
		List<ServerDto> list1=new ArrayList<ServerDto>();
		for(Server server : list) {
			ServerDto obj1=new ServerDto();
			obj1.setId(server.getId());
			obj1.setAge(server.getAge());
			obj1.setAddress(server.getAddress());
			list1.add(obj1);
     }
		return list1;
	}
	
	public String deleteServer(int id) {
		serverRepository.deleteById(id);
		return "Success";
	}
	
	
}
