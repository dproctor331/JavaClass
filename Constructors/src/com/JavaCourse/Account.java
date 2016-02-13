package com.JavaCourse;

/**
 * Created by Daniel on 11/14/2015.
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this(00000, 0.0, "Default Name", "default@email.com", "123-456-7890");
    }

    public Account(int number, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double funds) {
        this.balance += funds;
    }

    public void withdrawFunds(double funds) {
        if(funds <= this.balance) {
            this.balance -= funds;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
