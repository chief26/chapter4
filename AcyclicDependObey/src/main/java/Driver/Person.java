package Driver;

import Drive.DriverInterface;
import Vehicle.Car;

/**
 * Created by student on 2016/04/04.
 */
public class Person implements DriverInterface{
        @Override
        public String driveCar(DriverInterface di, String driving) {
            return null;
        }

        @Override
        public String getCar(String type) {
            Car car = new Car();
            car.setType(type);
            return car.getType();
        }

        @Override
        public boolean driving(String option) {
            if(option.equalsIgnoreCase("yes"))
                return true;
            else
                return false;
        }
}
