package com.hillel.hrebeniev.homeworks.homework_4;

public class Dog extends Animals {
    private final double MAX_RUN_DISTANCE = 500;
    private final double MAX_SWIM_DISTANCE = 10;
    private static int dogCount;

    public Dog() {
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(double distance) {
        if ((distance > 0) && (distance <= MAX_RUN_DISTANCE)) {
            System.out.println("Dog run " + distance + " meters");
        } else {
            System.out.println("False");
        }
    }

    @Override
    public void swim(double distance) {
        if ((distance > 0) && (distance <= MAX_SWIM_DISTANCE)) {
            System.out.println("Dog swim " + distance + " meters");
        } else {
            System.out.println("False");
        }
    }
}
