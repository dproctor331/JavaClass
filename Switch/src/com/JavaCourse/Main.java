package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was one");
//        } else if (value == 2) {
//            System.out.println("Value was two");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value is one");
//                break;
//            case 2:
//                System.out.println("Value is two");
//                break;
//            case 3:case 4:case 5:
//                System.out.println("Was a 3, 5, or 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

//        char letter = 'f';
//
//        switch (letter) {
//            case 'a':
//                System.out.println("The letter is a");
//                break;
//            case 'b':
//                System.out.println("The letter is b");
//                break;
//            case 'c':
//                System.out.println("The letter is c");
//                break;
//            case 'd':
//                System.out.println("The letter is d");
//                break;
//            case 'e':
//                System.out.println("The letter is e");
//                break;
//            default:
//                System.out.println("None of the letters was found");
//                break;
//        }

        String month = "FEBRUARY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("First Month!");
                break;
            case "february":
                System.out.println("Second Month!");
                break;
            case "march":
                System.out.println("Third Month!");
                break;
            case "april":
                System.out.println("Fourth Month!");
                break;
            case "may":
                System.out.println("Fifth Month!");
                break;
            default:
                System.out.println("Not one of the first five months");
                break;
        }

    }
}
