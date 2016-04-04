package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class CarAutomaticTest {
    private CarAutomatic ca;

    @Before
    public void setUp() throws Exception {
        ca = new CarAutomatic();
    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("car driving", ca.drive());

    }

    @Test
    public void testBrake() throws Exception {
        Assert.assertEquals("car braking", ca.brake());

    }

    @Test
    public void testGears() throws Exception {
        Assert.assertEquals("car changing gear", ca.automaticGearbox());
    }
}
