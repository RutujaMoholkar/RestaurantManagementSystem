package com.example.RestaurantManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestaurantManagementSystem.exception.ResourceNotFoundException;
import com.example.RestaurantManagementSystem.model.User;
import com.example.RestaurantManagementSystem.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            user.setPassword((user.getPassword()));
            return userRepository.save(user);
        } else {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
    }

    // public void registerUser(User user) {
    // // Encode password before saving
    // user.setPassword(passwordEncoder.encode(user.getPassword()));
    // userRepository.save(user);
    // }

}
