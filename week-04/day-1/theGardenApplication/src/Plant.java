public class Plant {
  protected String color;
  protected double waterLevel;
  protected boolean needsWater;

  public Plant(String color, Double waterLevel) {
    this.color = color;
    this.waterLevel = waterLevel;
    this.needsWater = needsWater;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }

  public boolean getNeedsWater() {
    if (waterLevel > 0) {
      return true;
    } else {
      return false;
    }
  }

}
