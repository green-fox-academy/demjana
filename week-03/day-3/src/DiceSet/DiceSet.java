package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {
  ArrayList<Integer> dice = new ArrayList<>();

  public List<Integer> roll() {
    for (int i = 0; i < 6; i++) {
      dice.add((int) (Math.random() * 6) + 1);
    }
    return dice;
  }

  public List<Integer> getCurrent() {
    return dice;
  }

  public int getCurrent(int i) {
    return dice.get(i);
  }

  // reroll all elements
  public void reroll() {
    for (int i = 0; i < dice.size(); i++) {
      dice.set(i, (int) (Math.random() * 6) + 1);
    }
  }

  // reroll only one element
  public void reroll(int k) {
    dice.set(k, (int) (Math.random() * 6) + 1);
  }

  public static void main(String[] args) {
    // You have a `DiceSet` class which has a list for 6 dice
    // You can roll all of them with roll()
    // Check the current rolled numbers with getCurrent()
    // You can reroll with reroll()
    // Your task is to roll the dice until all of the dice are 6

    DiceSet diceSet = new DiceSet();
    System.out.println(diceSet.getCurrent()); // empty - before roll
    System.out.println(diceSet.roll()); // roll
    System.out.println(diceSet.getCurrent()); // print current values
    System.out.println(diceSet.getCurrent(5)); // print the last element
    diceSet.reroll(); // just reroll
    System.out.println(diceSet.getCurrent());
    diceSet.reroll(4); // reroll the 5th element
    System.out.println(diceSet.getCurrent()); // get current values
    //
    System.out.println();
    //
    for (int i = 0; i < 6; i++) {
      while (diceSet.getCurrent(i) != 6) {
        diceSet.reroll(i);
      }
    }
    System.out.println("*J*A*C*K*P*O*T*");
    System.out.println(diceSet.getCurrent());
  }
}