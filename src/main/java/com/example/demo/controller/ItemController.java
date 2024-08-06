package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
@Autowired
private ItemService itemService;

@PostMapping("/post")
public String postValue(@RequestBody Item item) {
	itemService.addValue(item);
	return "Success";
}
@GetMapping("/{name}/{page}/{size}")
public Page<Item> getValue(@PathVariable String name,@PathVariable int page,@PathVariable int size){
	return itemService.getValue(name,page,size)  ; 
}
}
