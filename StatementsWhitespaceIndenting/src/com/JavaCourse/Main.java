package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
	    int myVariable = 50; //statement is complete line.  Includes expressions + ;, etc
        myVariable++;
        myVariable--;
        System.out.println("this is a test"); //statements can span multiple lines

        System.out.println("this is one line" +
                " and the second" +
                " and the third.");

        int anotherVariable = 50;myVariable--;System.out.println("This is another one" + anotherVariable);

        if (myVariable == anotherVariable) {
            System.out.println("printed");
        }
    }
}
