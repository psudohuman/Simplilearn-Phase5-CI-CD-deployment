package com.simplilearn.sportyshoes.services;

import java.util.List;

import com.simplilearn.sportyshoes.entities.Product;

public interface ProductService {
      public List<Product> getProducts();
      public Product getProduct(long productId);
      public Product addProduct(Product product );
      public Product updateProduct(Product product);
      public void deleteProduct(long productId);
}
