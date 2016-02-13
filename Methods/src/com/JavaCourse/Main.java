package com.JavaCourse;

public class Main {

    public static void main(String[] args) {

        System.out.println(calculateScore(true, 800, 5, 100));

        System.out.println(calculateScore(true, 10000, 8, 200));

        displayHighScorePosition("Dan", calculateHighScorePosition(1500));
        displayHighScorePosition("Dan", calculateHighScorePosition(900));
        displayHighScorePosition("Dan", calculateHighScorePosition(400));
        displayHighScorePosition("Dan", calculateHighScorePosition(50));
        displayHighScorePosition("Dan", calculateHighScorePosition(500));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 0;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        }
        else if (score >= 500) {
            return 2;
        }
        else if (score >= 100) {
            return 3;
        }
        else {
            return 4;
        }


    }

}
