package com.mycompany;

import Driver.Person;
import Vehicle.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class PersonTest {
    private Person person;
    private Car car;

    @Before
    public void setUp() throws Exception {
        person = new Person();
        car = new Car();
    }

    @Test
    public void testDriving() throws Exception {
        Assert.assertTrue("not driving", person.driving("yes"));

    }

    @Test
    public void testGetCar() throws Exception {
        car.setType("Skyline");
        Assert.assertEquals("Skyline", person.getCar(car));
    }
}
