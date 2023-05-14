package com.hillel.hrebeniev.homeworks.homework_18.strategy;

import lombok.Value;

@Value
public class Shape {
    FigureArea figureArea;

    public double calculateArea() {
        return figureArea.calculateArea();
    }
}