package com.mycompany.app;

import Drive.DriverInterface;
import Vehicle.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class CarTest {
    private DriverInterface d;

    @Before
    public void setUp() throws Exception {
        d = new Car();
    }

    @Test
    public void testDriveCar() throws Exception {
        Assert.assertEquals("Car is driving at 60km/h", d.driveCar(d, "yes"));

    }
}
