package com.example.RestaurantManagementSystem.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    // @ManyToOne
    // @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable =
    // false)
    // private Order order; // Represents the order associated with this order item.

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable = false)
    // @Transient // Mark as transient to exclude it from serialization
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", nullable = false)
    private Product product; // Represents the product associated with this order item.

    @ManyToOne
    @JoinColumn(name = "food_category_id", referencedColumnName = "category_id")
    private FoodCategory foodCategory;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    public OrderItem() {

    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderItem(Long orderItemId, Order order, Product product, FoodCategory foodCategory, Integer quantity,
            BigDecimal unitPrice, BigDecimal totalPrice) {
        this.orderItemId = orderItemId;
        this.order = order;
        this.product = product;
        this.foodCategory = foodCategory;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

}
