package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class CarManual implements ManualInterface, BrakeInterface, DriveInterface {

    private String text;

    @Override
    public String drive(){
        text = "car driving";
        return text;
    }
    @Override
    public String brake(){
        text = "car braking";
        return text;
    }

    @Override
    public String manualGearbox(){
        text = "driver changing gear";
        return text;
    }

}
