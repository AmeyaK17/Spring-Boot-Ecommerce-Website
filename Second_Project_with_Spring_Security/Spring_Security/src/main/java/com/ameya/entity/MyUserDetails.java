package com.ameya.entity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

    private String userName;
    private int age;
    private int id;
    private List<GrantedAuthority> authorities;
    
    @Autowired
	DemoEntity demoEntity;

    public MyUserDetails(Optional<User> user) {
    	
        this.userName = demoEntity.getName();
        this.age = demoEntity.getAge();
        this.id = demoEntity.getId();
        //this.authorities = Arrays.stream(demoEntity.getRoles().split(","))
          //          .map(SimpleGrantedAuthority::new)
            //        .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        String password = null;
		return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getId() {
        return id;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}


