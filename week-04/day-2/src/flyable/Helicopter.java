package flyable;

public class Helicopter extends Vehicle implements Flyable {
  public void fly() {
    System.out.println("whup - whuup - whuuup");
  }

  public void land() {
    System.out.println("Tocotocotocotocotoco");
  }

  public void takeOff() {
    System.out.println("whooop - whoop - whop");
  }
}