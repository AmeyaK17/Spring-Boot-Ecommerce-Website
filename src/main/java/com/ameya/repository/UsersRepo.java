package com.ameya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ameya.entity.UsersEntity;

@Repository
public interface UsersRepo extends CrudRepository<UsersEntity, Integer>{
	@Query(value="select UserId, U_Name, U_DoB from Users", nativeQuery = true)
	public List<Object> getAllusers();

	@Query(value="select UserId, U_Name, U_DoB from Users where UserId = :id", nativeQuery= true)
	public Object getUserById(@Param("id") int id);

	@Query(value="SET IDENTITY_INSERT Users ON", nativeQuery = true)
	public void setIdentityInsertOn();

	//@Query(value="insert into Users(U_Name, U_address, U_Permanent_Addr)values(?, ?, ?)" , nativeQuery = true)
	//public void addUser(@Param("userData") Object userData);
}
