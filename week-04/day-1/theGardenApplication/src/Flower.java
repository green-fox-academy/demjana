public class Flower extends Plant {

  public Flower(String color, Double waterLevel) {
    super(color, waterLevel);
    this.needsWater = getNeedsWater();
  }

  public boolean getNeedsWater(){
    if (waterLevel < 5) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void setWaterLevel(double waterLevel){
    super.setWaterLevel(waterLevel*0.75);
  }

}
