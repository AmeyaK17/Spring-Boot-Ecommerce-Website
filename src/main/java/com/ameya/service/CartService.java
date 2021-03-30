package com.ameya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.entity.CartEntity;
import com.ameya.repository.CartRepo;

@Service
public class CartService {

	@Autowired
	CartRepo cartRepo;
	
	public Object getCartbyUserID(int id) {
		return cartRepo.getCartbyUserID(id);
	}

	public void addToCart(int id, CartEntity cartData) {
		cartRepo.save(cartData);
	}

	public void removeFromCart(int id) {
		cartRepo.deleteById(id);
		
	}

}
