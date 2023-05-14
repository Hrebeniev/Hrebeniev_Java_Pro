package com.hillel.hrebeniev.homeworks.homework_18.builder;

public interface CarBuilder {
    CarBuilder buildEngine(String engine);

    CarBuilder buildTransmission(String transmission);

    CarBuilder buildWheels(String wheels);

    CarBuilder buildColor(String color);

    Car getCar();
}