package com.hillel.hrebeniev.homeworks.homework_27_server;

import com.hillel.hrebeniev.homeworks.homework_27_client.OrderService;
import lombok.SneakyThrows;

import javax.xml.ws.Endpoint;

public class Main {
    private static final String ADDRESS = "http://localhost:9999/orders?wsdl";
    private static final Object SERVICE = new OrderService();

    public static void main(String[] args) {
        Endpoint endpoint = Endpoint.publish(ADDRESS, SERVICE);
        sleep();
        endpoint.stop();
    }

    @SneakyThrows
    private static void sleep() {
        while (true) {
            Thread.sleep(1000000);
        }
    }
}