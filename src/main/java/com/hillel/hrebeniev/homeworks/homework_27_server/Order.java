package com.hillel.hrebeniev.homeworks.homework_27_server;

import com.hillel.hrebeniev.homeworks.homework_27_client.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {
    String  id;
    String date;
    double cost;
    List<Product> products;
}