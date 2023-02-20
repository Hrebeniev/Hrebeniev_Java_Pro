package com.hillel.hrebeniev.homeworks.homework_5.GeometricShape;

import com.hillel.hrebeniev.homeworks.homework_5.Interfaces.GeometricShape;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
