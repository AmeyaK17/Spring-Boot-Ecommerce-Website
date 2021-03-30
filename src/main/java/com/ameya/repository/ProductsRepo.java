package com.ameya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ameya.entity.ProductsEntity;

@Repository
public interface ProductsRepo extends CrudRepository<ProductsEntity, Integer> {

	@Query(value="select P_Name, P_Desc, P_Category, P_Price from Products", nativeQuery=true)
	public List<Object> getAllProducts();

	@Query(value="select P_Name, P_Desc, P_Category, P_Price from Products where P_Name = :name", nativeQuery = true)
	public Object getProductByName(@Param("name") String name);

}
