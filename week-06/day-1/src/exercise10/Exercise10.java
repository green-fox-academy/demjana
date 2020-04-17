//Write a Stream Expression to find the foxes with green color!
//Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//Write a Stream Expression to find the frequency of foxes by color!

package exercise10;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Vuk", Color.ORANGE, 2));
    foxes.add(new Fox("Karak", Color.ORANGE, 10));
    foxes.add(new Fox("Iny", Color.GREEN, 6));
    foxes.add(new Fox("Kag", Color.GREEN, 6));
    foxes.add(new Fox("Csele", Color.RED, 3));

    List<Fox> greenFoxes = foxes.stream()
        .filter(fox -> fox.getColor().equals(Color.GREEN))
        .collect(Collectors.toList());
    System.out.println(greenFoxes);

    List<Fox> youngGreenFoxes   = foxes.stream()
        .filter(fox->fox.getColor().equals(Color.GREEN))
        .filter(fox->fox.getAge()<5)
        .collect(Collectors.toList());
    System.out.println(youngGreenFoxes);

    Map<Color,Long> frequencyOfFoxesByColor = foxes.stream()
        .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
    frequencyOfFoxesByColor.entrySet().forEach(System.out::println);
  }
}
