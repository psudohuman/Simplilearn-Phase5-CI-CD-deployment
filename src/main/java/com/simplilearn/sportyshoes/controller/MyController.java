package com.simplilearn.sportyshoes.controller;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.sportyshoes.entities.Product;
import com.simplilearn.sportyshoes.services.ProductService;

@RestController
public class MyController {
	
	@Autowired
	private ProductService productServices;
	
	
	
	@GetMapping("/home")
    public String home() {
    	return "Welcome to Sporty Shoes";
    }
	//get the products
	@GetMapping("/products")
	public List<Product> getProducts(){
		return this.productServices.getProducts();
	}
	
	//get single product
	@GetMapping("/products/{productId}")
	public Product getProduct (@PathVariable String productId) {
		return this.productServices.getProduct(Long.parseLong(productId));
	}
	
	//add product
	@PostMapping("/products")
	public Product addProduct( @RequestBody Product product)  {
		return this.productServices.addProduct(product);
	}
	
	//update course using PUT method
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {
		return this.productServices.updateProduct(product);
	}
	
	//delete the course
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<HttpStatus> deleteProduct(@PathVariable String productId){
		try {
			this.productServices.deleteProduct(Long.parseLong(productId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
		 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}







