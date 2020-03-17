package Animal;

public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger--;
  }

  public void thirst() {
    this.thirst--;
  }

  public void play() {
    this.hunger++;
    this.thirst++;
  }

}
