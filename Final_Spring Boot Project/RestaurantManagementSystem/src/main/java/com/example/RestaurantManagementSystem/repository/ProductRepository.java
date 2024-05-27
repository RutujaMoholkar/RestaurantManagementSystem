package com.example.RestaurantManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestaurantManagementSystem.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
