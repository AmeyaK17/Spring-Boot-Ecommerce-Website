package com.ameya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.ameya.entity.DemoEntity;

public interface DemoRepo extends JpaRepository<DemoEntity, Integer> {
    Optional<User> findByUserName(String userName);
	
}
