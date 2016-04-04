package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class PassResultTest {
    private Student s1;
    private Student s2;
    private StudentPassResult spr;
    private StudentOverallPercentage sop;

    @Before
    public void setUp() throws Exception {
        s1 = new Student(25, 50);
        s2 = new Student(25, 20);
        spr = new StudentPassResult();
        sop = new StudentOverallPercentage();
    }

    @Test
    public void testPassResultTrue() throws Exception {
        sop.overallPercent(s1);
        Assert.assertTrue("The student fail", spr.getPassResult(s1));
    }

    @Test
    public void testPassResultFalse() throws Exception {
        sop.overallPercent(s2);
        Assert.assertFalse("The student passes", spr.getPassResult(s2));
    }
}
