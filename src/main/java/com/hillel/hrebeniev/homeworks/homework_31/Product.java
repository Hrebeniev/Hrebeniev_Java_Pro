package com.hillel.hrebeniev.homeworks.homework_31;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    int id;
    String name;
    Double cost;
}