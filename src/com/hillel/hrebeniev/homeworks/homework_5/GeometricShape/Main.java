package com.hillel.hrebeniev.homeworks.homework_5.GeometricShape;

import com.hillel.hrebeniev.homeworks.homework_5.GeometricShape.Circle;
import com.hillel.hrebeniev.homeworks.homework_5.GeometricShape.GeometricShape;
import com.hillel.hrebeniev.homeworks.homework_5.GeometricShape.Square;
import com.hillel.hrebeniev.homeworks.homework_5.GeometricShape.Triangle;

public class Main {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Triangle(3.0, 4.0);
        shapes[2] = new Square(5.0);

        double totalArea = 0.0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println("Total area of all shapes: " + totalArea);
    }
}
