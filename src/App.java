// TODO Add private users registration
// TODO Make reservation possible
    // TODO Check line 40, i want to print the  car brands

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Creating cars
        Car car1 = new Car("A1B2C3", "Toyota", "Glanza", 3000,"hybrid");
        Car car2 = new Car("D1E2F3", "Peugeot", "208", 4000,"gasoline");
        Car car3 = new Car("G1H2I3", "Porsche", "718", 10000,"automatic");
        Car car4 = new Car("J1K2L3", "Tesla", "Cybertruck", 7000, "automatic");
        Car car5 = new Car("M1N2O3", "Mini", "Cooper", 4000, "automatic");
        Car car6 = new Car("P1Q2R3", "Ford", "Transit custom", 4000, "manual");


        // Creating offices
        Office bergenOffice = new Office("Artin Car Rental Bergen", 12345678, "McExample St.", 1);
        Office tromsoOffice = new Office("Artin Car Rental Tromsø", 87654321, "Example Road", 2);
        Office stavangerOffice = new Office("Artin Car Rental Stavanger", 18273645, "Coolville", 2);

        // Adding cars to each office, two each
        bergenOffice.registerCar(car1);
        bergenOffice.registerCar(car2);
        tromsoOffice.registerCar(car3);
        tromsoOffice.registerCar(car4);
        stavangerOffice.registerCar(car5);
        stavangerOffice.registerCar(car6);

        // User registration


        // Reservation process
        System.out.println("Welcome to Artin's Car Rental, please choose your location: \n 1: Bergen \n 2: Tromsø \n 3: Stavanger");
        Scanner scanner = new Scanner(System.in);
        int cityChoice = scanner.nextInt();

        if (cityChoice == 1) {
            System.out.println("You have chosen Bergen. These are the available cars at the moment.");
            System.out.println(bergenOffice.cars);
        } else if (cityChoice == 2) {
            System.out.println("You have chosen Tromsø. These are the available cars at the moment.");
            System.out.println(tromsoOffice.cars);
        } else if (cityChoice == 3) {
            System.out.println("You have chosen Stavanger. These are the available cars at the moment.");
            System.out.println(stavangerOffice.cars);
        } else {
            System.out.println("WRONG");
        }

    }
}
