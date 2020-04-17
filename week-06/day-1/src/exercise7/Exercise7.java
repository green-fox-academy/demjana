// Write a Stream Expression to find the strings which starts with a given letter(as parameter),
// in the following list:

package exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
        "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    char firstLetter = 'a';
    List<String> listOfCities = cities.stream()
        .filter(word->word.startsWith(Character.toString(firstLetter).toUpperCase()))
        .collect(Collectors.toList());
    System.out.println(listOfCities);

  }
}
