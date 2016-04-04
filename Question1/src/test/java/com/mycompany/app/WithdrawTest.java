package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/31.
 */
public class WithdrawTest {
    private TransactionInterface b;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        b = (TransactionInterface)ctx.getBean("withdraw");
    }

    @Test
    public void testWithdrawExecute() throws Exception {
        Assert.assertEquals(2500.00, b.execute(2500.00), 00);
    }
}
