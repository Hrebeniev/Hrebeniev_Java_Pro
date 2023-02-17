package com.hillel.hrebeniev.homeworks.homework_4;

public class Cat extends Animals {
    private final double maxRunDistance = 200;
    private static int catCount;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }


    @Override
    public void run(double distance) {
        if ((distance > 0) && (distance <= maxRunDistance)) {
            System.out.println("Cat run " + distance + " meters");
        } else {
            System.out.println("False");
        }
    }

    @Override
    void swim(double distance) {
        System.out.println("Cat do not swim");
    }
}
