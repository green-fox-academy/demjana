//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array
//  Example:
//  System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
//  should print: `[0, 1, 4]`
//  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
//  should print: '[]'

import java.util.Arrays;

public class FindAPartOfAnInteger {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));
    System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
  }

  public static int[] subInt(int number, int[] array) {
    int newArrayLength = 0;
    for (int element : array) {
      if (String.valueOf(element).contains(String.valueOf(number))) {
        newArrayLength++;
      }
    }
    int[] index = new int[newArrayLength];
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      if (String.valueOf(array[i]).contains(String.valueOf(number))) {
        index[counter] = i;
        counter++;
      }
    }
    return index;
  }
}
