package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area(){
        return width*height;
    }
}
