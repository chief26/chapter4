package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}
