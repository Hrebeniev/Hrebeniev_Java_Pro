package com.hillel.hrebeniev.homeworks.homework_18.strategy;

public class Triangle implements FigureArea {
    int base;
    int height;

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
