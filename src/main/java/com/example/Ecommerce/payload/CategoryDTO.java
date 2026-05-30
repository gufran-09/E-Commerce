package com.example.Ecommerce.payload;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data  // Automatically generate getter and setters
@NoArgsConstructor  // Generate a constructor with no parameter
@AllArgsConstructor   // Generate a constructor with all parameter
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;
}
