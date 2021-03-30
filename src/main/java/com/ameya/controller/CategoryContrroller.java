package com.ameya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ameya.entity.CategoryEntity;
import com.ameya.service.CategoryService;

@RestController
public class CategoryContrroller {
	
	@Autowired
	CategoryService catService;

	@RequestMapping(value="/categories")
	public List<Object> getAllCategories(){
		return catService.getAllCategories();
	}
	
	@RequestMapping(value="/categories/{name}")
	public Object getCategoryByName(@PathVariable String name){
		return catService.getCategoryByName(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/categories")
	public void addCategory(@RequestBody CategoryEntity catData) {
		catService.addCategory(catData);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/categories/{id}")
	public void removeCategory(@PathVariable int id) {
		catService.removeCategory(id);
	}
}
