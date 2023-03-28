package com.backend.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.ecommerce.model.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
