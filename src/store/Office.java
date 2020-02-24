package store;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<Car> cars = new ArrayList<Car>();
    String officeName;
    int officePhone;
    String officeAddress;
    int officeNumber;

    // Constructor method to create a office
    public Office(String officeName, int officePhone, String officeAddress, int officeNumber) {
        Car[] cars;
        this.officeName = officeName;
        this.officePhone = officePhone;
        this.officeAddress = officeAddress;
        this.officeNumber = officeNumber;
    }

    // Method to register cars into a office
    public void registerCar(Car car) {
        cars.add(car);
    }

    // Method to remove cars from a office
    public void removeCar(Car car) {
        cars.remove(car);
    }

    public String toString() {
        String line = "==========";
        StringBuilder builder = new StringBuilder();

        builder.append(line + '\n');

        for (Car car : cars) {
            builder.append(String.format("%s\n%s\n", car.toString(), line));
        }

        return builder.toString();
    }

}
