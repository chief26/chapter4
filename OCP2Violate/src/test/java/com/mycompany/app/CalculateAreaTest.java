package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/31.
 */
public class CalculateAreaTest {

    Rectangle r;
    Circle c;
    CalculateArea ca;
    @Before
    public void setUp() throws Exception {
        ca = new CalculateArea();
    }

    @Test
    public void testCalculateArea() throws Exception {
        Assert.assertEquals(ca.area("rectangle"), 20000, 00);
    }
}
