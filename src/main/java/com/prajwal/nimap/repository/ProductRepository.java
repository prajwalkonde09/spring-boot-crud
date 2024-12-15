package com.prajwal.nimap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prajwal.nimap.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
