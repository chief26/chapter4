package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class CarTest {
    private Car bmw;

    @Before
    public void setUp() throws Exception {
        bmw = new Car();
    }

    @Test
    public void testIgnition() throws Exception {
        Assert.assertEquals("engine start", bmw.ignition());

    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("drive normal", bmw.drive());
    }
}
