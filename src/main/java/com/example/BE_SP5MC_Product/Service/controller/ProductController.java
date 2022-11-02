package com.example.BE_SP5MC_Product.Service.controller;

import com.example.BE_SP5MC_Product.Service.domain.Product;
import com.example.BE_SP5MC_Product.Service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productData")
public class ProductController {

    ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/product")

    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        Product product1 = productService.saveProduct(product);

        return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping("/getProduct")
    public ResponseEntity<?> getAllBook(){
        List list = productService.getAllProduct() ;
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
