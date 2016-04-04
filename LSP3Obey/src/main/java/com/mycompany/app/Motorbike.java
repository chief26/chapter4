package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class Motorbike extends Vehicle {
    private int numberOfWheels;

    @Override
    public int numberOfWheels(){
        numberOfWheels = 2;
        return numberOfWheels;
    }
}
