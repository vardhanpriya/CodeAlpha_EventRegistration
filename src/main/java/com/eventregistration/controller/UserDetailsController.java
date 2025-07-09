package com.eventregistration.controller;

import com.eventregistration.models.UserDetails;
import com.eventregistration.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "User Related APIs",description = "Create,Fetch User")
public class UserDetailsController {
        @Autowired
        private UserService userService;

        @GetMapping("/{id}")
        public ResponseEntity<UserDetails> getUserById(@PathVariable Long id) {
            return ResponseEntity.ok(userService.getUserById(id));
        }

        @PostMapping("/create-user")
        public ResponseEntity<UserDetails> createUser(@RequestBody UserDetails user) {
            return ResponseEntity.ok(userService.createUser(user));
        }
    }


