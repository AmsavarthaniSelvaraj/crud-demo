package com.example.demo.dto;

import lombok.Data;

@Data
public class EmpDto {

	private int id;
	private String name;

	private ManagerDto manager;

}
