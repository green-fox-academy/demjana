package exercise10;

import java.awt.Color;

public class Fox {
  String name;
  Color color;
  int age;

  public Fox(String name, Color color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Color getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return name;
  }
}
