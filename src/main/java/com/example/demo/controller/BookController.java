package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/post")
	public String addBook(@RequestBody BookDto book) {
		bookService.saveBook(book);
		return "Success";
	}

	@GetMapping("/get/{id}")
	public BookDto getBook(@PathVariable int id) {
		return bookService.getBook(id);
	}

	@GetMapping("/getAll")
	public List<BookDto> getAllBooks() {
		return bookService.getAll();
	}

	@PutMapping("/update")
	public String updateBook(@RequestBody BookDto book) {
		bookService.saveBook(book);
		return "success";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "success";
	}

}
