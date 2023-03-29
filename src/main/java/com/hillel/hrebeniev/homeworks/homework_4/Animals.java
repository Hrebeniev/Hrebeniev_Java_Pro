package com.hillel.hrebeniev.homeworks.homework_4;

abstract class Animals {
    private static int animalCount;
    public Animals() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    abstract void run(double distance);

    abstract void swim(double distance);
}
