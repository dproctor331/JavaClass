package com.JavaCourse;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = new int[5];
        myIntegers = getIntegers(5);
        System.out.println("\nArray in Original Order");
        printArray(myIntegers);
        System.out.println("\nSorted Array of Integers");
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Please enter " + number + " numbers.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            int lowerCount = 0;
            for(int j = 0; j < array.length; j++) {
                if (value < array[j]) {
                    lowerCount += 1;
                }
            }
            sortedArray[lowerCount] = value;
        }
        return sortedArray;
    }
}
