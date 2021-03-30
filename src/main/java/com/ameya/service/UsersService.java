package com.ameya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.entity.UsersEntity;
import com.ameya.repository.UsersRepo;

@Service
public class UsersService {
	
	@Autowired
	UsersRepo usersRepo;
	
	public List<Object> getAllUsers(){
		return usersRepo.getAllusers();
	}

	public Object getUserById(int id) {
		return usersRepo.getUserById(id);
	}

	public void addUser(UsersEntity userData) {
		//usersRepo.setIdentityInsertOn();
		usersRepo.save(userData);
	}

	public void removeProduct(int id) {
		usersRepo.deleteById(id);
	}

	public void updateUser(UsersEntity userData, int id) {
		//Object oldUserData = usersRepo.getUserById(id);
		usersRepo.save(userData);
		
	}
}
