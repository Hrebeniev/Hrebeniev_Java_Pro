package com.hillel.hrebeniev.homeworks.homework_5;

class Person implements Participant {
    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Person(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " метрів");
        } else {
            System.out.println(name + " не зміг пробігти " + distance + " метрів");
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " перестрибнув " + height + " метрів");
        } else {
            System.out.println(name + " не зміг перестрибнути " + height + " метрів");
        }
    }

    @Override
    public String toString() {
        return "Людина " + name;
    }
}