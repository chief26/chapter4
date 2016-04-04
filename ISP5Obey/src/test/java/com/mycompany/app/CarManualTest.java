package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class CarManualTest {
    private CarManual cm;

    @Before
    public void setUp() throws Exception {
        cm = new CarManual();
    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("car driving", cm.drive());

    }

    @Test
    public void testBrake() throws Exception {
        Assert.assertEquals("car braking", cm.brake());

    }

    @Test
    public void testGears() throws Exception {
        Assert.assertEquals("driver changing gear", cm.manualGearbox());
    }
}
