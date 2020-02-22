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


}
