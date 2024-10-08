package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
