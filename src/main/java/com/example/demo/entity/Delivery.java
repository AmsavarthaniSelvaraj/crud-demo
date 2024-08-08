package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="delivery")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {

	
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String personName;
		private String address;
		

	}


