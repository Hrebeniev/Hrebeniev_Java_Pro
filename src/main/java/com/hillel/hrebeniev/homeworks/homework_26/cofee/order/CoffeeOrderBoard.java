package com.hillel.hrebeniev.homeworks.homework_26.cofee.order;

import com.hillel.hrebeniev.homeworks.homework_14.cofee.order.Order;
import lombok.Data;
import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * order queue.
 */
@Data
public class CoffeeOrderBoard {
    private static final Logger log = Logger.getLogger(CoffeeOrderBoard.class);
    Queue<Order> orders;
    int orderNumber;

    public CoffeeOrderBoard() {
        this.orders = new LinkedList<>();
        orderNumber = 1;
    }

    public void add(String clientName) {
        log.info("Adding order for client: " + clientName);
        orders.add(new Order(orderNumber, clientName));
        orderNumber++;
    }

    /**
     * gives out the nearest order.
     */
    public void deliver() {
        if (!orders.isEmpty()) {
            Order order = orders.poll();
            log.info("Delivering order #" + order.getOrderNumber() + " for " + order.getClientName());
            System.out.println(
                    "Delivering order #" + order.getOrderNumber() + " for " + order.getClientName());
        } else {
            log.warn("No orders in queue!");
            System.out.println("No orders in queue!");
        }
    }

    /**
     * issues an order by number.
     */
    public void deliver(int orderNumber) {
        log.info("Delivering order #" + orderNumber);
        Order order = null;
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order o = iterator.next();
            if (o.getOrderNumber() == orderNumber) {
                order = o;
                iterator.remove();
                break;
            }
        }

        if (order != null) {
            log.info("Delivering order #" + order.getOrderNumber() + " for " + order.getClientName());
            System.out.println(
                    "Delivering order #" + order.getOrderNumber() + " for " + order.getClientName());
        } else {
            log.error("Order #" + orderNumber + " not found!");
            System.out.println("Order #" + orderNumber + " not found!");
        }
    }

    /**
     * current queue in console.
     */
    public void draw() {
        log.info("Current queue:");
        for (Order order : orders) {
            log.info(order.getOrderNumber() + " | " + order.getClientName());
            System.out.println(order.getOrderNumber() + " | " + order.getClientName());
        }
    }
}