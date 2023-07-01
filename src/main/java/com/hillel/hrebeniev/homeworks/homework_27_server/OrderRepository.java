package com.hillel.hrebeniev.homeworks.homework_27_server;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}