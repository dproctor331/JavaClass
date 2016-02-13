package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000,2));
        System.out.println(calculateInterest(10000,3));
        System.out.println(calculateInterest(10000,4));

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000,i));
        }

        int start = 237;
        int end = 781;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (count >= 3) {
                break;
            } else {
                if (isPrime(i) == true) {
                    System.out.println(i + " is a prime number.");
                    count++;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * interestRate/100);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
