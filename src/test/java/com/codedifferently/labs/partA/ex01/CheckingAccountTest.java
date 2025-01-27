package com.codedifferently.labs.partA.ex01;

import partA.ex01.CheckingAccount;

public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount();
        checking.name = "Angel";
        checking.balance = 1000.0;
        checking.deposit(10.0);
        checking.displayCustomer();

        CheckingAccount checking2 = new CheckingAccount();
        checking2.name = "Zuri";
        checking2.balance = 2000.0;
        checking2.deposit(100.0);
        checking2.displayCustomer();
    }
}
