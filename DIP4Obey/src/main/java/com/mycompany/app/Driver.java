package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class Driver {
    CarInterface car;



    public CarInterface getCar() {
        return car;
    }

    public void setCar(CarInterface car) {
        this.car = car;
    }

    public String driveCar(){
        return car.ignition()+" "+car.drive();
    }


}

