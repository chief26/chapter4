package com.mycompany.app;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/31.
 */
public class DepositTest {
    private TransactionInterface a;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        a = (TransactionInterface)ctx.getBean("deposit");
    }
    @Test
    public void testDepositExecute() throws Exception {
        Assert.assertEquals(15000.00, a.execute(5000.00), 00);
    }

}
