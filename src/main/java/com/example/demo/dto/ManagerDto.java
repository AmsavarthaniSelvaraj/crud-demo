package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class ManagerDto {
	private int id;
	private String name;

	private List<EmpDto> emp;
}
