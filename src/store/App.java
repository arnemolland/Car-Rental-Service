// TODO Add private users registration
// TODO Make reservation possible
// TODO Check line 40, i want to print the  car brands

package store;

public class App {
    public static void main(String[] args) {

        // Creating cars
        Car car1 = new Car("A1B2C3", "Toyota", "Glanza", 3000);
        Car car2 = new Car("D1E2F3", "Peugeot", "208", 4000);
        Car car3 = new Car("G1H2I3", "Porsche", "718", 10000);
        Car car4 = new Car("J1K2L3", "Tesla", "Cybertruck", 7000);
        Car car5 = new Car("M1N2O3", "Mini", "Cooper", 4000);
        Car car6 = new Car("P1Q2R3", "Ford", "Transit custom", 4000);

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
        boolean success = true;
        Printer printer = new Printer();

        do {
            int cityChoice = printer.getLocation();
            switch (cityChoice) {
                case 1:
                    printer.printOffice(bergenOffice);
                    break;
                case 2:
                    printer.printOffice(tromsoOffice);
                    break;
                case 3:
                    printer.printOffice(stavangerOffice);
                    break;
                default:
                    printer.printError();
                    success = false;
                    break;
            }
        } while (!success);

        printer.close();
    }
}
