package com.hillel.hrebeniev.homeworks.homework_18.strategy;

public class Rectangle implements FigureArea {
    int width;
    int height;

    @Override
    public double calculateArea() {
        return width * height;
    }
}
