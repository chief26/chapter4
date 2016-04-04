package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class OverallPercentageTest {
    private Student s;
    private StudentOverallPercentage sop;
    @Before
    public void setUp() throws Exception {
        s = new Student(25, 50);
        sop = new StudentOverallPercentage();
    }

    @Test
    public void testOverallPercentage() throws Exception {
        sop.overallPercent(s);
        Assert.assertEquals(0.75, s.getPercentage(), 00);
    }
}
