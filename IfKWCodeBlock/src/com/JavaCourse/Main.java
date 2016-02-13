package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score + (levelCompleted * bonus);

        if (gameOver){
            System.out.println("Your score was " + score);
            System.out.println("You reached level " + levelCompleted);
            System.out.println("And you received a bonus of " + bonus);
            System.out.println("Your final score is " + finalScore);
        } else {
            System.out.println("Keep Playing!");
        }

        System.out.println("---------------------------------");

        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondbonus = 200;

        if(gameOver) {
            int secondFinalScore = secondScore + (secondLevelCompleted * secondbonus);
            System.out.println("Your (second) final score was " + secondFinalScore);
        }
    }
}
