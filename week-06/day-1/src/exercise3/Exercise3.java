//Write a Stream Expression to find which number squared value is more then 20 from the following list:

package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

    String listOfNumbers = numbers.stream()
        .filter(number -> number * number > 20)
        .map(Object::toString)
        .collect(Collectors.joining(", "));
    System.out.println(listOfNumbers);
  }
}
