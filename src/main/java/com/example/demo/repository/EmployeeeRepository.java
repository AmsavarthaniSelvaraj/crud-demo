package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employeee;

@Repository
public interface EmployeeeRepository extends JpaRepository<Employeee, Integer> {

	@Query(value = "SELECT * FROM Employeee e WHERE e.department=:department", nativeQuery = true)
	List<Employeee> findByDepartment(@Param("department") String department);

	@Query(value = "SELECT * FROM Employeee e WHERE e.name LIKE %:name%", nativeQuery = true)
	List<Employeee> findByNameContaining(@Param("name") String name);
}
