package com.example.RestaurantManagementSystem.controller;

import java.util.List;
import java.util.Optional;

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

import com.example.RestaurantManagementSystem.model.FoodCategory;
import com.example.RestaurantManagementSystem.service.FoodCategoryService;

@RestController
@RequestMapping("/api/food-categories")
public class FoodCategoryController {

    @Autowired
    private FoodCategoryService foodCategoryService;

    @GetMapping
    public List<FoodCategory> getAllFoodCategories() {
        return foodCategoryService.getAllFoodCategories();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodCategory> getFoodCategoryById(@PathVariable Long id) {
        Optional<FoodCategory> foodCategory = foodCategoryService.getFoodCategoryById(id);
        return foodCategory.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FoodCategory> createFoodCategory(@RequestBody FoodCategory foodCategory) {
        FoodCategory createdFoodCategory = foodCategoryService.createFoodCategory(foodCategory);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFoodCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FoodCategory> updateFoodCategory(@PathVariable Long id,
            @RequestBody FoodCategory foodCategory) {
        FoodCategory updatedFoodCategory = foodCategoryService.updateFoodCategory(id, foodCategory);
        return ResponseEntity.ok(updatedFoodCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFoodCategory(@PathVariable Long id) {
        foodCategoryService.deleteFoodCategory(id);
        return ResponseEntity.noContent().build();
    }
}
