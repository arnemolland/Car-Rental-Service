// TODO Add a list of cars to each office, with the ability to add and remove
// TODO Add private users registration
// TODO Make reservation possibleimport java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Creating cars
        Car car1 = new Car("A1B2C3", "Toyota", "Glanza", 2400,"hybrid");
        Car car2 = new Car("D1E2F3", "Peugeot", "208", 2600,"gasoline");
        Car car3 = new Car("G1E2F3", "Porsche", "718", 3000,"automatic");

        // Creating offices
        Office bergenOffice = new Office("Artin Car Rental Bergen", 12345678, "McExample St.", 1);
        Office tromsoOffice = new Office("Artin Car Rental Tromsø", 87654321, "Example Road", 2);
        Office stavangerOffice = new Office("Artin Car Rental Stavanger", 18273645, "Coolville", 2);


        bergenOffice.registerCar(car1);
        bergenOffice.registerCar(car2);
        tromsoOffice.registerCar(car3);
    }
}
