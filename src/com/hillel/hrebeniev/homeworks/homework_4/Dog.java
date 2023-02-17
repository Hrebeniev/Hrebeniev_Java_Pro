package com.hillel.hrebeniev.homeworks.homework_4;

public class Dog extends Animals {
    private final double maxRunDistance = 500;
    private final double maxSwimDistance = 10;
    private static int dogCount;

    public Dog() {
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(double distance) {
        if ((distance > 0) && (distance <= maxRunDistance)) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Дистанция превышает допустимое значение");
        }
    }

    @Override
    public void swim(double distance) {
        if ((distance > 0) && (distance <= maxSwimDistance)) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Дистанция превышает допустимое значение");
        }
    }
}
