package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class CarTest {
    CarInterface car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("car driving", car.drive());
    }

    @Test
    public void testBrake() throws Exception {
        Assert.assertEquals("car braking", car.brake());

    }

    @Test
    public void testChangeGear() throws Exception {
        Assert.assertEquals("car changing gear", car.automaticGearbox());
    }
}
