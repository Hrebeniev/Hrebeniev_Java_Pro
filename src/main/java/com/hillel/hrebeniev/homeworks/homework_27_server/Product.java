package com.hillel.hrebeniev.homeworks.homework_27_server;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
    String id;
    String name;
    double cost;
}