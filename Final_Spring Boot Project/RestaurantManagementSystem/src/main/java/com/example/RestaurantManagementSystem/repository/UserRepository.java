package com.example.RestaurantManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.RestaurantManagementSystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User getUserById(@Param("id") Long id);
    Optional<User> findByEmail(String email);

}
