package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " x 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println(previousResult + " + 1 =  " + result);

        result++;
        System.out.println(previousResult + "++ =  " + result);

        result--;
        System.out.println(previousResult + "-- =  " + result);

        result += 2;
        System.out.println(previousResult + " += 2 = " + result);

        result *= 10;
        System.out.println(previousResult + " *= 10 = " + result);

        result -= 10;
        System.out.println(previousResult + " -= 10 = " + result);

        result /= 10;
        System.out.println(previousResult + " /= 10 = " + result);

        boolean isAlien = false;

        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got the high score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore <100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90)|| (secondTopScore <=90))
        System.out.println("one of these tests is true");

        int newValue = 50;
        if (newValue == 50) //using only one =
            System.out.println("This is an error");

        boolean isCar = false;
        boolean wasCar = isCar ? true : false; //ternary operator says if the isCar returns true, return true else return false

        System.out.println("----------------------------");

        double firstValue = 20d;
        System.out.println("First Value is " + firstValue);
        double secondValue = 80d;
        System.out.println("Second value is " + secondValue);
        double aggValue = (firstValue + secondValue) * 25;
        System.out.println("Derived value is " + aggValue);
        double remainder = aggValue % 2300;
        System.out.println("Remainder value is " + remainder);
        if (remainder <= 200)
            System.out.println("Total was over the limit");


    }
}
