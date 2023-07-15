package com.hillel.hrebeniev.homeworks.homework_33;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@Data
public class OrderRepository {
    private Map<UUID, Order> orders;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        orders.put(order.getId(), order);
    }

    public Order getOrderById(UUID id) {
        return orders.get(id);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }
}