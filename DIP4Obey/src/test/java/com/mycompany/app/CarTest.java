package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class CarTest {
    private CarInterface car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
    public void testIgnition() throws Exception {
        Assert.assertEquals("engine start", car.ignition());
    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("drives normal", car.drive());
    }
}
