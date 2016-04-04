package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class Motorbike extends Car{


    public int getBikeNumberOfWheels(){
        this.setNumberOfWheels(2);
        return this.getNumberOfWheels();
    }

}
