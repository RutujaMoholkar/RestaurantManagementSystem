package com.example.RestaurantManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestaurantManagementSystem.model.Order;
import com.example.RestaurantManagementSystem.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // public Optional<Order> getOrderById(Long id) {
    //     return orderRepository.findById(id);
    // }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long id, Order order) {
        if (orderRepository.existsById(id)) {
            order.setOrderId(id);
            return orderRepository.save(order);
        } else {
            throw new IllegalArgumentException("Order not found with id: " + id);
        }
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public Order findOrderWithItemsById(Long orderId) {
        Optional<Order> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isPresent()) {
            return optionalOrder.get();
        }
        return null; // or throw an exception if desired
    }


}
