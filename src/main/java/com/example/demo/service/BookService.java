package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public Book getBook(int id) {
		return bookRepository.findById(id).get();
	}

	public Book updateBook(Book book) {
		return bookRepository.saveAndFlush(book);
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}
}