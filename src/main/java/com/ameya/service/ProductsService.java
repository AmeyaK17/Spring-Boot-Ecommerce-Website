package com.ameya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.entity.ProductsEntity;
import com.ameya.repository.ProductsRepo;

@Service
public class ProductsService {

	@Autowired
	ProductsRepo prodRepo;
	
	public List<Object> getAllProducts() {
		return prodRepo.getAllProducts();
		
	}

	public Object getProductByName(String name) {
		return prodRepo.getProductByName(name);
	}

	public void addProduct(ProductsEntity productData) {
		prodRepo.save(productData);
	}

	public void removeProduct(int id) {
		prodRepo.deleteById(id);
	}

}
