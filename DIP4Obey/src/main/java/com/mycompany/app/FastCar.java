package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class FastCar implements CarInterface{
    private String status;
    private String start;

    @Override
    public String drive(){
        status = "drives faster";
        return status;
    }

    @Override
    public String ignition(){
        start = "engine start";
        return start;
    }
}
