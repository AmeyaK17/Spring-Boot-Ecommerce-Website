package com.ameya.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ameya.entity.CartEntity;

@Repository
public interface CartRepo extends CrudRepository<CartEntity, Integer>{

	@Query(nativeQuery = true, value="select Users_Name, Product_Name, Product_Category, Quantity, Updated_Date from Cart where Users_ID = :id")
	public Object getCartbyUserID(@Param("id") int id);

}
