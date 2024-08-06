package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public Item addValue(Item item) {
		return itemRepository.save(item);
	}
	
	public Page<Item> getValue(String name,int page,int size){
		Pageable pageable=PageRequest.of(page,size);
		return itemRepository.findByNameContaining(name,pageable);
	}

}
