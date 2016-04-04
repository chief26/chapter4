package com.mycompany.app;

/**
 * Created by student on 2016/04/01.
 */
public class Driver {
    private Car car;
    private FastCar fastCar;
    private String text = "";

    public String driveCar(){
        car = new Car();
        text = car.ignition()+" "+car.drive();
        return text;
    }

    public String driveFastCar(){
        fastCar = new FastCar();
        text = "the "+fastCar.ignition()+","+fastCar.drive();
        return text;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public FastCar getFastCar() {
        return fastCar;
    }

    public void setFastCar(FastCar fastCar) {
        this.fastCar = fastCar;
    }
}
