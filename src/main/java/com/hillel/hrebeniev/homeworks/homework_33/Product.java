package com.hillel.hrebeniev.homeworks.homework_33;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {
    UUID id = UUID.randomUUID();
    String name;
    double cost;
}