package com.example.RestaurantManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestaurantManagementSystem.model.LoginForm;


@Repository
public interface LoginRepository extends JpaRepository<LoginForm, Long> {

    LoginForm findByEmail(String email);
    
} 