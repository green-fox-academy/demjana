package FleetOfThings;

import java.util.ArrayList;
import java.util.List;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing GetMilk = new Thing("Get milk");

    Thing RemoveTheObstacles = new Thing("Remove the obstacles");

    Thing StandUp = new Thing("Stand up");
    StandUp.complete();

    Thing EatLunch = new Thing("Eat lunch");
    EatLunch.complete();

    fleet.add(GetMilk);
    fleet.add(RemoveTheObstacles);
    fleet.add(StandUp);
    fleet.add(EatLunch);

    System.out.println(fleet);
  }
}