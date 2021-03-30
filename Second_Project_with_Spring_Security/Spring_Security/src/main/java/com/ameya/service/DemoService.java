package com.ameya.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ameya.entity.DemoEntity;
import com.ameya.entity.MyUserDetails;
import com.ameya.repository.DemoRepo;

@Service
public class DemoService implements UserDetailsService {

    @Autowired
    DemoRepo demoRepo;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = demoRepo.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

       //return user.map(MyUserDetails::new).get();
        return new MyUserDetails(user);
    }
}
