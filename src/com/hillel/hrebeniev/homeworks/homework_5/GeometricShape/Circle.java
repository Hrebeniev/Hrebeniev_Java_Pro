package com.hillel.hrebeniev.homeworks.homework_5.GeometricShape;

public class Circle implements GeometricShape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
