package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account(12345, 100.00, "Jim", "Jim@example.com", "123-456-7890");
        myAccount.withdrawFunds(100);

        myAccount.depositFunds(50);
        myAccount.withdrawFunds(100);
        myAccount.depositFunds(51);
        myAccount.withdrawFunds(100);
        System.out.println(myAccount.getBalance());

        VipCustomer myVipAccount = new VipCustomer();
        System.out.println("Credit Limit " + myVipAccount.getCreditLimit() + " Email Address "
                + myVipAccount.getEmailAddress());
    }
}
