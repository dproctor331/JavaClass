package com.JavaCourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone;
        Scanner scanner = new Scanner();
        int option = 0;
        boolean quit = false;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("That is not a valid choice, please select another option.");
                    printInstructions();
            }
        }
    }

    static void printInstructions() {
        System.out.println("1 - Print list of contacts");
        System.out.println("2 - Add a new contact");
        System.out.println("3 - Update an existing contact");
        System.out.println("4 - Remove contact");
        System.out.println("5 - Search for contact");
    }
}
