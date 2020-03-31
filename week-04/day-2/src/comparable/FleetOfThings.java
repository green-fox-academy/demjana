package comparable;

import java.util.Collections;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing thing1 = new Thing("Get milk");
    Thing thing2 = new Thing("Remove the obstacles");
    Thing thing3 = new Thing("Stand up");
    thing3.complete();
    Thing thing4 = new Thing("Eat lunch");
    thing4.complete();

    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);
    fleet.add(thing4);

    System.out.println(fleet);
    Collections.sort(fleet.things);
    System.out.println(fleet);
  }
}