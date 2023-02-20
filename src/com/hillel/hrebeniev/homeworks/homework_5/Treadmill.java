package com.hillel.hrebeniev.homeworks.homework_5;

class Treadmill implements Obstacle {
    final String name = "Racetrack";
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        if (participant.getRunLength() >= length) {
            System.out.println("Participant " + participant.getName() + " overcame " + name + " " + length + " m");
            participant.addPassedDistance(length);
            participant.addPassedObstacle();
            return true;
        }
        System.out.println("Participant " + participant.getName() + " didn't overcome " + name + " " + length + " m");
        return false;
    }
}
