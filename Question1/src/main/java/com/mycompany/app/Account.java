package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class Account {
    private int accNum;
    private double balance;

    public Account() {
        this.accNum = 555;
        this.balance = 300.00;
    }

    public Account(int accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }
}
