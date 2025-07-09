package com.eventregistration.service.impl;

import com.eventregistration.models.UserDetails;
import com.eventregistration.repository.UserDetailRepo;
import com.eventregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDetailRepo userDetailRepo;
    @Override
    public UserDetails getUserById(Long id) {
        return userDetailRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public UserDetails createUser(UserDetails userDetails) {
         return userDetailRepo.save(userDetails);
    }
}


