package day009;

public class ClassWork {
    public static void main(String[] args) {
        /**
         * Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
         * при езде до 50 км/час нарушений нет;
         * за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
         *
         * за превышение скорости от 16 км/час — 40 евро штрафа;
         * за езду от 100 км/час до 130 км/час — штраф 500 евро;
         * и за езду свыше
         */

        int speed = 100;

        System.out.println("Your speed was: " + speed + "km/h");

        // cascading if conditions

        if (speed <= 50) System.out.println("All right.");
        else if (speed <= 65) System.out.println("You get a lesson with duration 5 minutes.");
        else if (speed <= 100) System.out.println("You have to pay 40$.");
        else if (speed <= 130) System.out.println("You have to pay 500$.");
        else System.out.println("You have to pay 500$. And drive prohibition for 1 week.");
    }
}
