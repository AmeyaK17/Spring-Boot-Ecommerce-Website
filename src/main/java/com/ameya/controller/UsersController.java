package com.ameya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ameya.entity.UsersEntity;
import com.ameya.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	UsersService usersService;
	
	@RequestMapping("/users")
	public List<Object> getAllUsers(){
		return usersService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public Object geyUserById(@PathVariable int id ) {
		return usersService.getUserById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
	@PostMapping
	public void addUser(@RequestBody UsersEntity userData) {
		System.out.println(userData);
		usersService.addUser(userData);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public void updateUser(@RequestBody UsersEntity userData, @PathVariable int id) {
		usersService.updateUser(userData, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="users/{id}")
	public void removeUser(@PathVariable int id) {
		usersService.removeProduct(id);
	}
}
