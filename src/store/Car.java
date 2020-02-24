package store;

public class Car {
   String licensePlate;
   String carBrand;
   String carModel;
   int price;
   Boolean available;

   // Constructor method to make a car
   public Car(String licensePlate, String carBrand, String carModel, int price) {
      this.licensePlate = licensePlate;
      this.carBrand = carBrand;
      this.carModel = carModel;
      this.price = price;
      available = true;
   }

   public String toString() {
      return String.format("🏭: %s \n🚗: %s \n🍛: %s \n💸: %d \n🛒: %s", carBrand, carModel, licensePlate, price,
            available ? "✅" : "🚫");
   }
}
