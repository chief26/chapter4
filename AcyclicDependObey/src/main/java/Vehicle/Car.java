package Vehicle;

import Drive.DriverInterface;

/**
 * Created by student on 2016/04/04.
 */
public class Car implements DriverInterface{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

        @Override
        public String driveCar(DriverInterface di, String driving) {
            if(di.driving(driving))
                return "Car is driving at 60km/h";
            else
                return "Car is not driving";
        }

        @Override
        public String getCar(String type) {
            return null;
        }

        @Override
        public boolean driving(String option) {
            if(option.equalsIgnoreCase("yes"))
                return true;
            else
                return false;
        }
}
