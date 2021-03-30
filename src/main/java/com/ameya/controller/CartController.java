package com.ameya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ameya.entity.CartEntity;
import com.ameya.service.CartService;

@RestController
public class CartController {

	@Autowired
	CartService cartService;
	
	@RequestMapping(value="/cart/{id}")
	public Object getCartbyUserID(@PathVariable int id) {
		return cartService.getCartbyUserID(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/cart/{id}")
	public void addToCart(@PathVariable int id, @RequestBody CartEntity cartData) {
		cartService.addToCart(id, cartData);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/cart/{id}")
	public void removeFromCart(@PathVariable int id) {
		cartService.removeFromCart(id);
	}
}
