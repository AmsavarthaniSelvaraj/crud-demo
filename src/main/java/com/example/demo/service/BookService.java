package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
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
			Book book1 = optional.get();
			dto.setBookName(book1.getBookName());
			dto.setId(book1.getId());
			dto.setBookPrice(book1.getBookPrice());
		}
		return dto;
	}

	public List<BookDto> getAll() {
		List<Book> list = bookRepository.findAll();
		List<BookDto> list1 = new ArrayList<BookDto>();
		for (Book book : list) {
			BookDto dto = new BookDto();
			dto.setId(book.getId());
			dto.setBookName(book.getBookName());
			dto.setBookPrice(book.getBookPrice());
			list1.add(dto);
		}
		return list1;
	}

}
