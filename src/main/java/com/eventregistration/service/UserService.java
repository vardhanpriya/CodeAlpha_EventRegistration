package com.eventregistration.service;

import com.eventregistration.models.UserDetails;

public interface UserService {
        UserDetails getUserById(Long id);
        UserDetails createUser(UserDetails userDetails);
    }



