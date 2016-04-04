package com.mycompany.app;

/**
 * Created by student on 2016/03/31.
 */
public class CalculateArea {
    public double area(String add){
        double area = 0;
        if(add.equalsIgnoreCase("rectangle"))
        {
            Rectangle r = new Rectangle(200,100);
            area = r.getHeight() * r.getWidth();
        }
        else
        {
            Circle c = new Circle(10);
            area = c.getRadius() * c.getRadius() * Math.PI;
        }

        return area;
    }
}
