package com.hillel.hrebeniev.homeworks.homework_5;

import com.hillel.hrebeniev.homeworks.homework_5.Obstacles.Obstacle;
import com.hillel.hrebeniev.homeworks.homework_5.Obstacles.Treadmill;
import com.hillel.hrebeniev.homeworks.homework_5.Obstacles.Wall;
import com.hillel.hrebeniev.homeworks.homework_5.Participants.Cat;
import com.hillel.hrebeniev.homeworks.homework_5.Participants.Participant;
import com.hillel.hrebeniev.homeworks.homework_5.Participants.Person;
import com.hillel.hrebeniev.homeworks.homework_5.Participants.Robot;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Participant> participants = new ArrayList<>();
        ArrayList<Obstacle> obstacles = new ArrayList<>();

        participants.add(new Person("Nick", 100, 2));
        participants.add(new Cat("Leo",50,5));
        participants.add(new Robot("Rob2000",2777,0));

        obstacles.add(new Treadmill(100));
        obstacles.add(new Wall(1));

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
