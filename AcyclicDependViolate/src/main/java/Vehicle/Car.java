package Vehicle;

import Driver.Person;

/**
 * Created by student on 2016/04/04.
 */
public class Car {
    private String type;
    private Person ben = new Person();
    public String driveCar(String driving){
        if(ben.driving(driving))
            return "Car is driving at 60km/h";
        else
            return "Car is not driving";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
