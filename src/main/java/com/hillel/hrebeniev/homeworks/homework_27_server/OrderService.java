package com.hillel.hrebeniev.homeworks.homework_27_server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class OrderService {
    private final OrderRepository orderRepository = new OrderRepository();

    @WebMethod
    public void add(Order order) {
        orderRepository.addOrder(order);
    }

    @WebMethod
    public Order getById(String id) {
        return orderRepository.getOrderById(id);
    }

    @WebMethod
    public List<Order> getAll() {
        return orderRepository.getAllOrders();
    }
}