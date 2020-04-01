package flyable;

import main.java.animals.*;

public class Bird extends Animal implements Flyable {
  private boolean ableToSing;
  private boolean ableToFly;

  public Bird(String name) {
    super.name = name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void fly() {
    System.out.println("huph - huuph - huuuph");
  }

  @Override
  public void land() {
    System.out.println("Shhhhhhhhhhhhhhhhhhhh");
  }

  @Override
  public void takeOff() {
    System.out.println("hoooph - hooph - hoph");
  }

}
