import java.util.Arrays;

public class Reverse {
  // - Create an array variable named `numbers`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Reverse the order of the elements in `numbers`
  // - Print the elements of the reversed `numbers`
  public static void main(String[] args) {
    int[] number = {3, 4, 5, 6, 7};
    int[] reverseNumber = number.clone();
    int j = 0;
    for (int i = number.length - 1; i > -1; i--) {
      reverseNumber[j] = number[i];
      j++;
    }
    System.out.println("Before reverse: " + Arrays.toString(number));
    System.out.println("After reversing: " + Arrays.toString(reverseNumber));
  }
}
