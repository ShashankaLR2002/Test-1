package com.xworkz.crud.demo.service;

import com.xworkz.crud.demo.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO saveProduct(ProductDTO productDTO);

    List<ProductDTO> getAllActiveProducts();

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    String deleteProduct(Long id);
}
