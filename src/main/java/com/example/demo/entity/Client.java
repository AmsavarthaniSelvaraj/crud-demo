package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	
	//@OneToMany(targetEntity=Bill.class,cascade=CascadeType.ALL)
	//@JoinColumn(name="client_id",referencedColumnName="id")
	@OneToMany(mappedBy="client",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<Bill> bill;

}








//@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
