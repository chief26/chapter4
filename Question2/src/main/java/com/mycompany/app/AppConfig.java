package com.mycompany.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/31.
 */
@Configuration
public class AppConfig {
    @Bean(name="deposit")
    public TransactionInterface getDeposit(){
        return new DepositImpl(222333444, 10000.00);
    }

    @Bean(name="withdraw")
    public TransactionInterface getWithdraw(){
        return new WithdrawImpl(111333222, 5000.00);
    }
}
