package Sharpie;

public class Sharpie {
  String color;
  Double width;
  public Double inkAmount;

  public Sharpie() {
  }

  public Sharpie(String color, Double width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100d;
  }

  public void use() {
    this.inkAmount--;
  }
}
