public class Tree extends Plant {

  public Tree(String color, Double waterLevel) {
    super(color, waterLevel);
    this.needsWater = getNeedsWater();
  }

  public boolean getNeedsWater() {
    if (waterLevel < 10) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void setWaterLevel(double waterLevel) {
    super.setWaterLevel(waterLevel * 0.4);
  }

}
