package com.mycompany;

import Vehicle.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class CarTest {
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();

    }

    @Test
    public void testDriveCar() throws Exception {
        Assert.assertEquals("Car is driving at 60km/h", car.driveCar("yes"));

    }

    @Test
    public void testType() throws Exception {
        car.setType("Nissan");
        Assert.assertEquals("Nissan", car.getType());

    }
}
