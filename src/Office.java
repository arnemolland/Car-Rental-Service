import java.util.ArrayList;
import java.util.List;

public class Office {
    List<Car> cars = new ArrayList<Car>();
    String officeName = null;
    int officePhone = 0;
    String officeAddress = null;
    int officeNumber = 0;

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
}
