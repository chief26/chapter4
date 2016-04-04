package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class WithdrawImpl implements TransactionInterface {

    private  Account a;
    public WithdrawImpl(int accNum, double balance) {

        a = new Account(accNum, balance);
    }

    @Override
    public double execute(double amount){
        return a.getBalance()-amount;
    }
}
