package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book updateBook(Book book) {
		return bookRepository.saveAndFlush(book);
	}

	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	public void saveBook(BookDto book) {
		Book book2 = new Book();
		book2.setBookName(book.getBookName());
		book2.setBookPrice(book.getBookPrice());
		bookRepository.saveAndFlush(book2);
	}

	public BookDto getBook(int id) {
//		Book book = bookRepository.findById(id).get();		
		BookDto dto = new BookDto();
		Optional<Book> optional = bookRepository.findById(id);
		if (optional.isPresent()) {
			Book book = optional.get();
			dto.setBookName(book.getBookName());
			dto.setId(book.getId());
			dto.setBookPrice(book.getBookPrice());
		}
		return dto;
	}
}