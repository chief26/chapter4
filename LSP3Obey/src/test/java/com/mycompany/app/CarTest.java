package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class CarTest {
    private Car car;
    @Before
    public void setUp() throws Exception {
        car = new Car();

    }

    @Test
    public void testNumberOfWheels() throws Exception {
        Assert.assertEquals(4, car.numberOfWheels());

    }
}
