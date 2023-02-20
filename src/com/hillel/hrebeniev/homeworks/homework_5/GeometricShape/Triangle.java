package com.hillel.hrebeniev.homeworks.homework_5.GeometricShape;

import com.hillel.hrebeniev.homeworks.homework_5.GeometricShape.GeometricShape;

public class Triangle implements GeometricShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
