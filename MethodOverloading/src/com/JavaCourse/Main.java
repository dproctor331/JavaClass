package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
        calculateScore("Dan", 500);
        calculateScore(500);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(6d,1d));
        System.out.println(calcFeetAndInchesToCentimeters(60d));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + ", score was " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player, score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player, No Score");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >=0 && inches <= 12) {
            double centimeters = ((feet * 12) + inches) * 2.54;
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {
            double centimeters = inches * 2.54;
            return centimeters;
        } else {
            return -1;
        }
    }
}
