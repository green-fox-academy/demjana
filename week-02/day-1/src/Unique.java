//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once
//  Example:
//  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`

import java.util.ArrayList;
import java.util.List;

public class Unique {
  public static void main(String[] args) {
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
  }

  public static List<Integer> unique(int[] array) {
    List<Integer> uniqueNumbers = new ArrayList<>();
    for (int element : array) {
      if (!uniqueNumbers.contains(element)) {
        uniqueNumbers.add(element);
      }
    }
    return uniqueNumbers;
  }
}
