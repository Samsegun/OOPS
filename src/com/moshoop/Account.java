package com.moshoop;

import java.text.NumberFormat;

public class Account {
    private double balance;
    private final NumberFormat currency;

    public Account() {
        this(0);
    }
    public Account(double openingBalance) {
        balance = openingBalance;
        currency = NumberFormat.getCurrencyInstance();
        System.out.println("Opening balance: " + currency.format(balance));
    }

    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount;
        printAccountBalance(withdrawalAmount, "debited");
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        printAccountBalance(depositAmount, "credited");
    }

    private void printAccountBalance(double amount, String action) {
        System.out.println("Your account has been " + action + " with " + currency.format(amount));
        this.printAccountBalance();
    }
    public void printAccountBalance() {
        System.out.println("Total balance: " + currency.format(getBalance()));
    }

    private double getBalance() {
        return balance;
    }
}
