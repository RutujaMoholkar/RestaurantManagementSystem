package com.example.RestaurantManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestaurantManagementSystem.model.FoodCategory;

@Repository
public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {

}
