package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class FastCarTest {
    private FastCar skyline;

    @Before
    public void setUp() throws Exception {
        skyline = new FastCar();
    }

    @Test
    public void testIgnition() throws Exception {
        Assert.assertEquals("engine start", skyline.ignition());

    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("drive faster", skyline.drive());
    }
}
