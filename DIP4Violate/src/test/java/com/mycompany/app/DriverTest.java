package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class DriverTest {
    private Driver mesias;
    private Driver john;
    private Car car;
    private FastCar fastCar;
    @Before
    public void setUp() throws Exception {
        mesias = new Driver();
        john = new Driver();
        car = new Car();
        fastCar = new FastCar();
    }

    @Test
    public void testDriveCar() throws Exception {

        mesias.setCar(car);
        Assert.assertEquals("engine start drive normal", mesias.driveCar());
    }

    @Test
    public void testDriveFastCar() throws Exception {
        john.setFastCar(fastCar);
        Assert.assertEquals("the engine start,drive faster", john.driveFastCar());

    }
}
