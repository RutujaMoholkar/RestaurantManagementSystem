package com.example.RestaurantManagementSystem.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "orders")
public class Order {

    /*
     * It includes a reference to the FoodCategory entity using the foodCategory
     * property.
     * This establishes a many-to-one relationship between orders and food
     * categories.
     * The foodCategory property is annotated with @ManyToOne to indicate the
     * many-to-one relationship.
     * The @JoinColumn annotation specifies the foreign key column in the orders
     * table that references the food_categories table.
     */

    /*
     * The @Temporal annotation in JPA (Java Persistence API) is used to specify the
     * type of the date or time object that the entity attribute maps to in the
     * database.
     * It is typically used in conjunction with the java.util.Date,
     * java.util.Calendar, and java.time.LocalDate, java.time.LocalDateTime,
     * java.time.LocalTime classes.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    // @Column(name = "order_date")
    // private LocalDateTime orderDate;

    // @Temporal(TemporalType.TIMESTAMP)
    // private Date orderDate;

    @Column(name = "total_price", precision = 10, scale = 2)
    private BigDecimal totalPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<OrderItem> orderItems; // represents the list of order items associated with this order.

    // (fetch = FetchType.LAZY) fetch = FetchType.LAZY indicates that the associated
    // Customer entity should be loaded lazily.

    public Order() {

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order(Long orderId, BigDecimal totalPrice, List<OrderItem> orderItems, User user) {
        this.orderId = orderId;
        this.totalPrice = totalPrice;
        this.orderItems = orderItems;
        this.user = user;
    }

}