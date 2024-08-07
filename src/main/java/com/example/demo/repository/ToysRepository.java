package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Toys;

@Repository
public interface ToysRepository extends JpaRepository<Toys, Integer> {

	@Query(value = "SELECT * FROM toys t WHERE (t.name=:name or :name is null) &(t.color=:color or :color is null)& (t.price=:price or :price is null) & (t.shop_name=:shopName or :shopName is null)", nativeQuery = true)
	Page<Toys> findByNameContaining(@Param("name") String name, @Param("color") String color,
			@Param("price") Double price, @Param("shopName") String shopName, Pageable pageable);

}
