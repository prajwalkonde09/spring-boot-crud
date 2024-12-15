package com.prajwal.nimap.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prajwal.nimap.model.Product;

import java.util.Optional;

public interface ProductService {
    Page<Product> getAllProducts(Pageable pageable);
    Product createProduct(Product product);
    Optional<Product> getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
