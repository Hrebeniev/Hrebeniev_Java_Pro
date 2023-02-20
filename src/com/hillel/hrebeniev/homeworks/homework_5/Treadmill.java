package com.hillel.hrebeniev.homeworks.homework_5;

class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void overcome(Participant c) {
        c.run(getLength());

    }
}
