package com.hillel.hrebeniev.homeworks.homework_32;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    int id;
    String name;
    double price;
}