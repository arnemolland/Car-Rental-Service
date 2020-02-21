public class Car {
    String licensePlate = null;
    String carBrand = null;
    String carModel = null;
    String carType = null;
    Boolean availability = false;

     public Car(String licensePlate, String carBrand, String carModel, String carType) {
        this.licensePlate = licensePlate;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carType = carType;
        availability = true;
     }
}
