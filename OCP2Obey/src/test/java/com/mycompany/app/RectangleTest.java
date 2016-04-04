package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/31.
 */
public class RectangleTest {
    Rectangle r;

    @Before
    public void setUp() throws Exception {
        r = new Rectangle(100,100);

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals(10000.00, r.area(), 00);

    }
}
