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

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/post")
	public String addBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return "success";
	}

	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable int id) {
		return bookService.getBook(id);
	}

	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "success";
	}

}
