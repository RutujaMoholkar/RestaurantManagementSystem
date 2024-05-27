package com.example.RestaurantManagementSystem.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.RestaurantManagementSystem.model.Order;

//This annotation marks the interface as a Spring-managed repository component.
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query("SELECT o FROM Order o JOIN FETCH o.orderItems WHERE o.orderId = :orderId")
    Order findOrderWithItemsByOrderId(@Param("orderId") Long orderId);
}
