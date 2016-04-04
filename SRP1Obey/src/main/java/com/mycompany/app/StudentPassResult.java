package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class StudentPassResult {

    public boolean getPassResult(Student s){
        if(s.getPercentage() > 0.5)
            return true;
        else
            return false;
    }
}
