package com.example.RestaurantManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestaurantManagementSystem.model.User;
import com.example.RestaurantManagementSystem.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // @PostMapping("/authenticate")
    // public ResponseEntity<?> authenticateUser(@RequestBody User user) {
    // // Retrieve user details from the database
    // User authenticatedUser = userService.findByUsername(user.getUsername());

    // // Check if the user exists and if the provided password is correct
    // if (authenticatedUser != null &&
    // authenticatedUser.getPassword().equals(user.getPassword())) {
    // // Generate JWT token
    // String jwtToken = jwtUtil.generateToken(authenticatedUser.getUsername());
    // return ResponseEntity.ok(jwtToken); // Return JWT token
    // } else {
    // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username
    // or password");
    // }
    // }

    @PostMapping("/addDetails")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    // @PostMapping("/register")
    // public ResponseEntity<?> registerUser(@RequestBody User user) {
    // userService.registerUser(user);
    // return new ResponseEntity<>("User registered successfully",
    // HttpStatus.CREATED);
    // }

    // @GetMapping("/user/userProfile")
    // @PreAuthorize("hasAuthority('ROLE_USER')")
    // public String userProfile() {
    // return "Welcome to User Profile";
    // }

    // @GetMapping("/admin/adminProfile")
    // @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    // public String adminProfile() {
    // return "Welcome to Admin Profile";
    // }

    // @GetMapping("/welcome")
    // public String welcome() {
    // return "Welcome this endpoint is not secure";
    // }

}
