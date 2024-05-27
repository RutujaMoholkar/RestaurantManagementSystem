package com.example.RestaurantManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.RestaurantManagementSystem.model.LoginForm;
import com.example.RestaurantManagementSystem.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean authenticateUser(String email, String password) {
        LoginForm user = loginRepository.findByEmail(email);
        if (user != null) {
            // Compare the provided password with the stored hashed password
            return passwordEncoder.matches(password, user.getPassword());
        }
        return false;
    }

    
}
