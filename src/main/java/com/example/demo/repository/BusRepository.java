package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bus;
@Repository
public interface BusRepository extends JpaRepository<Bus,Integer> {

}
