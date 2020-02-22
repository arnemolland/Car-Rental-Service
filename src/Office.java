import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Office {
    String officeName = null;
    int officePhone = 0;
    String officeAddress = null;
    int officeNumber = 0;
    Car[] availableCars = {};

    // Constructor method to register a office
    public Office(String officeName, int officePhone, String officeAddress, int officeNumber, Car[] availableCars) {
        this.officeName = officeName;
        this.officePhone = officePhone;
        this.officeAddress = officeAddress;
        this.officeNumber = officeNumber;
        this.availableCars = availableCars;

    }

}
