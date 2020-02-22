import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Office {
    String officeName = null;
    int officePhone = 0;
    String officeAddress = null;
    int officeNumber = 0;

    // Constructor method to register a office
    public Office(String officeName, int officePhone, String officeAddress, int officeNumber) {
        this.officeName = officeName;
        this.officePhone = officePhone;
        this.officeAddress = officeAddress;
        this.officeNumber = officeNumber;
    }

}
