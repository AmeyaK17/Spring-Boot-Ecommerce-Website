package com.ameya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ameya.entity.CategoryEntity;

@Repository
public interface CategoryRepo extends CrudRepository<CategoryEntity, Integer>{

	@Query(nativeQuery = true, value="select Cat_Name, Cat_Desc, Cat_Update_Date, Cat_Updated_By from Categories")
	public List<Object> getAllCategories();

	@Query(nativeQuery = true, value="select Cat_Name, Cat_Desc, Cat_Update_Date, Cat_Updated_By from Categories where Cat_Name= :name")
	public Object getCategoryByName(@Param("name") String name);
	
	
	
}
