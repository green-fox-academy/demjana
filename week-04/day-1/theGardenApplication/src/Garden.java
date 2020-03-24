import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();
  }

  public void addPlants(Plant newPlant) {
    if (newPlant != null) {
      this.plants.add(newPlant);
    }
  }

  public void stateOfPlant() {
    for (Plant p : this.plants) {
      if (p instanceof Flower) {
        System.out.println("The " + p.color + " Flower " +
            (((Flower) p).getNeedsWater() ? "needs" : "does not need" + " water."));
      } else {
        System.out.println("The " + p.color + " Tree " +
            (((Tree) p).getNeedsWater() ? "needs" : "does not need" + " water."));
      }
    }
  }

  public void watering(int waterAmount) {
    System.out.println("Watering with " + waterAmount);
    double waterAmountPerPlant = getPlantsNeedWater(this.plants, waterAmount);
    for (Plant p : this.plants) {
      if (p instanceof Flower) {
        ((Flower) p).setWaterLevel(waterAmountPerPlant);
      } else {
        ((Tree) p).setWaterLevel(waterAmountPerPlant);
      }
    }
  }

  public int getPlantsNeedWater(List<Plant> plants, int waterAmount) {
    int count = 0;
    for (Plant p : this.plants) {
      if (p.getNeedsWater()) {
        count++;
      }
    }
    return waterAmount / count;
  }
}
