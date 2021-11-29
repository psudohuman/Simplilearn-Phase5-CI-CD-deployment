package com.simplilearn.sportyshoes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.sportyshoes.entities.Product;

public interface ProductDao extends JpaRepository<Product, Long>{
     
}
