package com.hillel.hrebeniev.homeworks.homework_5;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Person("Bob", 300, 2),
                new Cat("Tom", 100, 3),
                new Robot("Rob", 200, 1)};
        Obstacle[] obstacles = {new Treadmill(150),
                new Wall(2),
                new Treadmill(300)};

        for (Participant participant : participants) {
            boolean isParticipantStillInGame = true;
            for (Obstacle obstacle : obstacles) {
                if (isParticipantStillInGame) {
                    obstacle.overcome(participant);
                } else {
                    break;
                }
            }
            if (isParticipantStillInGame) {
                System.out.println("Учасник " + participant + " успішно пройшов усі перешкоди!");
            } else {
                System.out.println("Учасник " + participant + " вибув з гри.");
            }
        }
    }
}
