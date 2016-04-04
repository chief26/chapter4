package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class DriverTest {
    private Driver shaun;
    CarInterface car;
    @Before
    public void setUp() throws Exception {
        shaun = new Driver();
        car = new FastCar();
    }

    @Test
    public void testDriveCar() throws Exception {
        shaun.setCar(car);
        Assert.assertEquals("engine start drives faster", shaun.driveCar());
    }
}
