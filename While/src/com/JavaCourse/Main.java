package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count < 6);
//
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count >100) {
//                break;
//            }
//        } while (count != 6);

        int number = 5;
        int evens = 0;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (evens >= 5){
                break;
            }

            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            evens++;
            System.out.println("Even " + evens + ": number " + number);
            number++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
