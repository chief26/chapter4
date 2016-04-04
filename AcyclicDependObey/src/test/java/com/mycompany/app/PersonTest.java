package com.mycompany.app;

import Drive.DriverInterface;
import Driver.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class PersonTest {
    private DriverInterface d;

    @Before
    public void setUp() throws Exception {

        d = new Person();

    }

    @Test
    public void testDriving() throws Exception {
        Assert.assertTrue("not driving", d.driving("yes"));
    }

    @Test
    public void testGetCar() throws Exception {
        Assert.assertEquals("Nissan", d.getCar("Nissan"));
    }
}
