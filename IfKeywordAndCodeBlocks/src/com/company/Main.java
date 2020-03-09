package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompeleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompeleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompeleted =8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompeleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
