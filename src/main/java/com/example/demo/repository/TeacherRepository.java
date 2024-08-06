package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
	@Query(value="SELECT * FROM teacher t WHERE t.name=:name", nativeQuery = true)
    List<Teacher> findByName(@Param("name")String name);
	
	@Query(value="SELECT * FROM teacher t WHERE t.number LIKE %:number", nativeQuery = true)
	List<Teacher> findByNumberContaining(@Param("number")String number);
}


