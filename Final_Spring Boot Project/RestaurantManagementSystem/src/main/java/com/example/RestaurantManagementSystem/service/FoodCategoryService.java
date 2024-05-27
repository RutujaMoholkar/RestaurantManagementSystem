package com.example.RestaurantManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestaurantManagementSystem.model.FoodCategory;
import com.example.RestaurantManagementSystem.repository.FoodCategoryRepository;

@Service
public class FoodCategoryService {

    @Autowired
    private FoodCategoryRepository foodCategoryRepository;

    public List<FoodCategory> getAllFoodCategories() {
        return foodCategoryRepository.findAll();
    }

    public Optional<FoodCategory> getFoodCategoryById(Long id) {
        return foodCategoryRepository.findById(id);
    }

    public FoodCategory createFoodCategory(FoodCategory foodCategory) {
        return foodCategoryRepository.save(foodCategory);
    }

    public FoodCategory updateFoodCategory(Long id, FoodCategory foodCategory) {
        if (foodCategoryRepository.existsById(id)) {
            foodCategory.setCategoryId(id);
            return foodCategoryRepository.save(foodCategory);
        } else {
            throw new IllegalArgumentException("Food category not found with id: " + id);
        }
    }

    public void deleteFoodCategory(Long id) {
        foodCategoryRepository.deleteById(id);
    }

}
