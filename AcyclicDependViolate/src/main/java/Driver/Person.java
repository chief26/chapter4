package Driver;

import Vehicle.Car;

/**
 * Created by student on 2016/04/04.
 */
public class Person{

    public boolean driving(String option){
        if(option.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

    public String getCar(Car c){
        return c.getType();
    }
}
