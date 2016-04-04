package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class StudentTest {
    private Student s1;
    private Student s2;

    @Before
    public void setUp() throws Exception {
        s1 = new Student(20, 75);
        s2 = new Student(20, 20);
    }

    @Test
    public void testOverallPercent() throws Exception {
        s1.ovarallPercent();
        Assert.assertEquals(0.95, s1.getPercent(), 00);
    }

    @Test
    public void testGetPassResult() throws Exception {
        s1.ovarallPercent();
        s2.ovarallPercent();
        Assert.assertTrue("student fail", s1.getPassResult());
        Assert.assertFalse("student pass", s2.getPassResult());
    }
}
