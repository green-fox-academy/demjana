//  Create a function that takes a list of numbers as parameter
//  Returns a list where the elements are sorted in ascending numerical order
//  Make a second boolean parameter, if it's `true` sort that list descending
//  Example:
//  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
//  should print [5, 9, 12, 24, 34]
//  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
//  should print [34, 24, 12, 9, 5]

import java.util.Arrays;

public class SortThatList {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
    System.out.println(Arrays.toString(advancedBubble(new int[] {34, 12, 24, 9, 5}, true)));
  }

  public static int[] bubble(int[] array) {
    int swap;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          swap = array[i];
          array[i] = array[j];
          array[j] = swap;
        }
      }
    }
    return array;
  }

  public static int[] advancedBubble(int[] array, boolean isDescending) {
    Arrays.sort(array);
    if (isDescending) {
      int swap;
      for (int i = 0; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
          if (array[i] < array[j]) {
            swap = array[i];
            array[i] = array[j];
            array[j] = swap;
          }
        }
      }
    }
    return array;
  }
}
