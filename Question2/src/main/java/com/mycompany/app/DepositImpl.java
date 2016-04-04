package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class DepositImpl implements TransactionInterface {

    private Account a;
    public DepositImpl(int accNum, double balance) {
        a = new Account(accNum, balance);
    }

    @Override
    public double execute(double amount){
        return a.getBalance()+amount;
    }
}
