package PetrolStation;

public class Station {
  int gasAmount;

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount = car.capacity;
  }
}
 /*
 Station
    -gasAmount
Refill(car) -> decreases the gasAmount by the
capacity of the car and increases the cars gasAmount
*/


