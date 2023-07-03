package com.hillel.hrebeniev.homeworks.homework_29;

import java.util.List;
import java.util.UUID;

public class OrderService {
    private final OrderRepository orderRepository = new OrderRepository();

    public Order addOrder(Order order) {
        return orderRepository.addOrder(order);
    }

    public Order getOrderById(UUID id) {
        return orderRepository.getOrderById(id);
    }

    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }
}