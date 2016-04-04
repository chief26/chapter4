package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class StudentOverallPercentage {

    public double overallPercent(Student s){
        double percent = 0;
        percent = (s.getMark1()+s.getMark2())/100;
        s.setPercentage(percent);
        return percent;
    }
}
