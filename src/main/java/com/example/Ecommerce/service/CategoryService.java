package com.example.Ecommerce.service;

import com.example.Ecommerce.Model.Category;
import com.example.Ecommerce.payload.CategoryDTO;
import com.example.Ecommerce.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize,String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);
    CategoryDTO updateCategory(CategoryDTO categoryDTO,Long categoryId);
}
