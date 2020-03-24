import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.addPlants(new Flower("yellow", 0d));
    garden.addPlants(new Flower("blue", 0d));
    garden.addPlants(new Tree("purple", 0d));
    garden.addPlants(new Tree("orange", 0d));

    garden.stateOfPlant();
    System.out.println("");
    garden.watering(40);
    garden.stateOfPlant();
    System.out.println("");
    garden.watering(70);
    garden.stateOfPlant();
  }

}
