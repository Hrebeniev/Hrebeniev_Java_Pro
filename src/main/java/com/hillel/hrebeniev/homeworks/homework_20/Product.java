package com.hillel.hrebeniev.homeworks.homework_20;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Product {
    int id;
    ProductType productType;
    double price;
    boolean isDiscountAvailable;
    LocalDateTime createdDate;
}