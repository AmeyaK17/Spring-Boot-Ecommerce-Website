package com.ameya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.entity.CategoryEntity;
import com.ameya.repository.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepo catRepo;

	public List<Object> getAllCategories() {
		return catRepo.getAllCategories();
	}

	public Object getCategoryByName(String name) {
		return catRepo.getCategoryByName(name);
	}

	public void addCategory(CategoryEntity catData) {
		catRepo.save(catData);
	}

	public void removeCategory(int id) {
		catRepo.deleteById(id);
		
	}

}
