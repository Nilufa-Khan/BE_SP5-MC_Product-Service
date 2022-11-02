package com.example.BE_SP5MC_Product.Service.repository;

import com.example.BE_SP5MC_Product.Service.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
