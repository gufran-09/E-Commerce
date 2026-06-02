package com.example.Ecommerce.service;

import com.example.Ecommerce.Model.Product;
import com.example.Ecommerce.payload.ProductDTO;
import com.example.Ecommerce.payload.ProductResponse;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO productDTO);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);
}
