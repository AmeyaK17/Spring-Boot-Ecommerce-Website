package com.ameya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ameya.entity.ProductsEntity;
import com.ameya.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	ProductsService prodService;
	
	@RequestMapping("/products")
	public List<Object> getAllProducts(){
		return prodService.getAllProducts();
	}
	
	@RequestMapping("/products/{name}")
	public Object getProductByName(@PathVariable String name) {
		return prodService.getProductByName(name);
	}
	
	@PostMapping(value = "/products")
	public void addProduct (@RequestBody ProductsEntity productData) {
		prodService.addProduct(productData);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="products/{id}")
	public void removeProduct(@PathVariable int id) {
		prodService.removeProduct(id);
	}
}
