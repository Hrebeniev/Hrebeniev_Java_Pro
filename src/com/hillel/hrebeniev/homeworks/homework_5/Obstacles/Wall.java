package com.hillel.hrebeniev.homeworks.homework_5.Obstacles;

import com.hillel.hrebeniev.homeworks.homework_5.Interfaces.Obstacle;
import com.hillel.hrebeniev.homeworks.homework_5.Participants.Participant;

public class Wall implements Obstacle {
    final String name = "Wall";
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        //Початок стрибків
        participant.jump();
        if (participant.getJumpHeight() >= height) {
            System.out.println("Participant " + participant.getName() + " overcame " + name + " " + height + " m");
            participant.addPassedObstacle();
            return true;
        }
        System.out.println("Participant " + participant.getName() + " didn't overcome " + name + " " + height + " m");
        return false;
    }
}
