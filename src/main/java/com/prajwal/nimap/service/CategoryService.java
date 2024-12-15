package com.prajwal.nimap.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prajwal.nimap.model.Category;

import java.util.Optional;

public interface CategoryService {
    Page<Category> getAllCategories(Pageable pageable);
    Category createCategory(Category category);
    Optional<Category> getCategoryById(Long id);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
