package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class MotorbikeTest {
    private Motorbike bike;
    @Before
    public void setUp() throws Exception {
        bike = new Motorbike();

    }

    @Test
    public void testNumberOfWheels() throws Exception {
        Assert.assertEquals(2, bike.numberOfWheels());

    }
}
