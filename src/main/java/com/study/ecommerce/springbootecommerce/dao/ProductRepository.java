package com.study.ecommerce.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.ecommerce.springbootecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
