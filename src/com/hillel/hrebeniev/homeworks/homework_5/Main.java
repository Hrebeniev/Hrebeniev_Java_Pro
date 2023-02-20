package com.hillel.hrebeniev.homeworks.homework_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Participant> participants = new ArrayList<>();
        ArrayList<Obstacle> obstacles = new ArrayList<>();

        participants.add(new Person("Nick", 220, 2));
        participants.add(new Cat("Leo",300,5));
        participants.add(new Robot("Rob2000",2777,0));

        obstacles.add(new Treadmill(25));
        obstacles.add(new Wall(1));
        obstacles.add(new Treadmill(50));
        obstacles.add(new Wall(4));
        obstacles.add(new Treadmill(100));
        obstacles.add(new Wall(5));

        for (Participant participant : participants) {
            System.out.println();
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    participant.result();
                    break;
                }
                participant.result();
            }
        }
    }
}
