package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery,Integer> {
@Query("SELECT d FROM Delivery d WHERE (d.personName LIKE :personName% or :personName is null) AND (d.address LIKE %:address or :address is null)") 
Page<Delivery> findByNameContaining(@Param ("personName") String personName,@Param("address")String address,Pageable pageable);
}
