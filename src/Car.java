public class Car {
    String licensePlate = null;
    String carBrand = null;
    String carModel = null;
    String carType = null;
    int price = 0;
    Boolean availability = false;

    // Constructor method to register a car
     public Car(String licensePlate, String carBrand, String carModel, int price, String carType) {
        this.licensePlate = licensePlate;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carType = carType;
        this.price = price;
        availability = true;
     }

         /*
         Car car1 = new Car("A1B2C3", "Toyota", "Glanza", "hybrid");
         Car car2 = new Car("D1E2F3", "Peugeot", "208", "gasoline");
         Car car3 = new Car("G1E2F3", "Porsche", "718", "automatic");

         Car[] availableCars = {car1, car2, car3};
          */
}
