package com.tutorial.ecommercerestapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tutorial.ecommercerestapi.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}