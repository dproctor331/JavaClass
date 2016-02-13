package com.ByteShortInt;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myIntValue = 98000;

        // int has a width of 8
        byte myByteValue = 10;

        // short has a width of 16
        short myShortValue = 6000;

        // long has a width of 64
        long myLongValue = 50000 + 10*(myByteValue + myIntValue + myShortValue);
        System.out.println(myLongValue);

    }
}
