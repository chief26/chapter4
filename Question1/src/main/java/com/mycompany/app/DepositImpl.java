package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class DepositImpl extends Account implements TransactionInterface {

    public DepositImpl(int accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public double execute(double amount){
        return getBalance()+amount;
    }
}
