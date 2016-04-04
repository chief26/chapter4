package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class WithdrawImpl extends Account implements TransactionInterface {

    public WithdrawImpl(int accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public double execute(double amount){
        return getBalance()-amount;
    }
}
