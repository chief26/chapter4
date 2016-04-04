package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class FastCar {
    private String status = "";
    private String start = "";

    public String drive(){
        status = "drive faster";
        return status;
    }

    public String ignition(){
        start = "engine start";
        return start;
    }
}
