package com.JavaCourse;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> contacts;
    private Scanner scanner = new Scanner();

    public void printContactList() {
        if (contacts.size() > 0) {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". Name: " + contacts.get(i).getName() + " Phone number: "
                        + contacts.get(i).getNumber());
            }
        } else {
            System.out.println("You do not have any contacts in your list.");
        }
    }

    public void addContactItem(String name, String number) {
        contacts.add(new Contacts(name, number));
    }

    public int findContactItem(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName() == name) {
                return i;
            }

            return -1;
        }
    }

    public void updateContactItem (int position, String name, String number) {
        contacts.set(position, new Contacts(name, number));
    }
}
