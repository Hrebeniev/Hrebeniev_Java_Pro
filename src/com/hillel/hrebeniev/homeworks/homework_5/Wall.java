package com.hillel.hrebeniev.homeworks.homework_5;

class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Participant c) {
        c.jump(getHeight());
    }
}