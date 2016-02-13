package com.JavaCourse;

/**
 * Created by Daniel on 11/14/2015.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("default@email.com", 0.0, "Default Name");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer(String emailAddress, double creditLimit, String name) {
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
