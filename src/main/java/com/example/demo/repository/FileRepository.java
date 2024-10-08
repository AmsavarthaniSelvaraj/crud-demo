package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Integer> {

}
