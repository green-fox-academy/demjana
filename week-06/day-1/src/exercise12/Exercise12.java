package exercise12;

import static java.util.stream.Collectors.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Exercise12 {
  public static void main(String[] args) {
    List<String> linesOfCharacters = new ArrayList<>();
    try {
      linesOfCharacters = Files.readAllLines(Paths.get("assets/swcharacters.csv"));
    } catch (IOException e) {
      System.out.println("Could not read the file!");
      System.exit(0);
    }

    List<SwCharacter> listOfSwCharacters = linesOfCharacters
        .stream()
        .skip(1)
        .map(line -> line.split(";"))
        .map(line -> new SwCharacter(line[0], line[1], line[2], line[3], line[4], line[5], line[6], line[7]))
        .collect(toList());

    // Print the name of the heaviest character (if the mass is unknown, ignore that character)
    System.out.println(listOfSwCharacters.stream()
        .map(c -> new SwCharacter(c.getName(), c.getHeight(), c.getMass().replace(",", ""),
            c.getHairColor(), c.getSkinColor(), c.getEyeColor(), c.getBirthYear(), c.getGender())) // Jabba's mass contains ","
        .filter(c -> isInteger(c.getMass()))
        .max(Comparator.comparing(c -> Integer.parseInt(c.getMass())))
        .orElseThrow(NoSuchElementException::new)
        .getName());

    // Print the average height of the male characters
    System.out.println(listOfSwCharacters.stream()
        .filter(c -> c.getGender().equals("male"))
        .filter(c -> isInteger(c.getHeight()))
        .map(SwCharacter::getHeight)
        .mapToInt(Integer::parseInt)
        .summaryStatistics()
        .getAverage());

    // Print the average height of the female characters
    System.out.println(listOfSwCharacters.stream()
        .filter(c -> c.getGender().equals("female"))
        .filter(c -> isInteger(c.getHeight()))
        .map(SwCharacter::getHeight)
        .mapToInt(Integer::parseInt)
        .summaryStatistics()
        .getAverage());

    Map<String, Map<String, Long>> mapOfGendersByAge = listOfSwCharacters.stream()
        .collect(groupingBy(Exercise12::groupedByGender, groupingBy(Exercise12::groupedByAge, counting())));

    mapOfGendersByAge.entrySet().forEach(System.out::println);
  }

  public static boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  // Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
  public static String groupedByGender(SwCharacter c) {
    if (!c.getGender().equals("male") && !c.getGender().equals("female")) {
      return "other";
    } else {
      return c.getGender();
    }
  }

  // The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
  public static String groupedByAge(SwCharacter c) {
    String birthYear = c.getBirthYear().replace("BBY", "");
    if (birthYear.equals("unknown")) {
      return birthYear;
    } else {
      double year = Double.parseDouble(birthYear); // Darth Vader's age "41.9BBY" ("BBY" stands for Before the Battle of Yavin)
      if (year < 21) {
        return "below 21";
      } else if (year > 40) {
        return "above 40";
      } else {
        return "between 21 and 40";
      }
    }
  }
}