package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BookDto {

	private int id;
	private String bookName;
	private int bookPrice;
}
