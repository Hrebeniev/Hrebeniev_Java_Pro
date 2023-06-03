package com.hillel.hrebeniev.homeworks.homework_20;

import java.time.LocalDateTime;

public class ProductBuilderImplement implements ProductBuilder {
    private static int nextId = 1;
    private final int id;
    private ProductType productType;
    private double price;
    private boolean isDiscountAvailable;
    private final LocalDateTime createdDate;

    public ProductBuilderImplement() {
        id = nextId;
        nextId++;
        createdDate = LocalDateTime.now();
    }

    @Override
    public ProductBuilder buildProductType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    @Override
    public ProductBuilder buildPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public ProductBuilder buildIsDiscountAvailable(boolean isDiscountAvailable) {
        this.isDiscountAvailable = isDiscountAvailable;
        return this;
    }

    @Override
    public Product getProduct() {
        return new Product(id, productType, price, isDiscountAvailable, createdDate);
    }
}