// Write a Stream Expression to concatenate a Character list to a string!

package exercise8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> listOfCharacters1 = Arrays.asList('T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 's', 't', 'r', 'i', 'n', 'g', '!');
    String string1 = listOfCharacters1.stream().map(c -> Character.toString(c)).collect(Collectors.joining());

    List<Character> listOfCharacters2 = Arrays.asList('T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 's', 't', 'r', 'i', 'n', 'g', '!');
    String string2 = listOfCharacters2.stream().map(String::valueOf).collect(Collectors.joining());

    List<Character> listOfCharacters3 = Arrays.asList('T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 's', 't', 'r', 'i', 'n', 'g', '!');
    String string3 = listOfCharacters3.stream().map(Object::toString).collect(Collectors.joining());

    System.out.println(string1);
    System.out.println(string2);
    System.out.println(string3);
  }
}
