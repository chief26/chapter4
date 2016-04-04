package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/31.
 */
public class CirlceTest {
    Circle c;

    @Before
    public void setUp() throws Exception {
        c = new Circle(25);
    }

    @Test
    public void testCircle() throws Exception {
        Assert.assertEquals(c.area(), 1963.4954084936207, 00);
    }
}
