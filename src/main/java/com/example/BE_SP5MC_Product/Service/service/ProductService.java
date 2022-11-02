package com.example.BE_SP5MC_Product.Service.service;

import com.example.BE_SP5MC_Product.Service.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProduct();
}
