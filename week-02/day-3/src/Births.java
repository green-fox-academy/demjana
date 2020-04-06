import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births {
  public static void main(String[] args) {
    System.out.println(yearOfMostBirth("assets/births.csv"));
  }

  public static int yearOfMostBirth(String fileName) {
    Path filepath = Paths.get(fileName);
    String[] oneLine;
    String[] date;
    int year = 0;
    Map<Integer, Integer> years = new HashMap<>();
    try {
      List<String> lines = Files.readAllLines(filepath);
      for (int i = 0; i < lines.size(); i++) {
        oneLine = lines.get(i).split(";");
        date = oneLine[1].split("-");
        year = Integer.parseInt(date[0]);
        for (int j = 0; j < lines.size(); j++) {
          if (years.containsKey(year)) {
            years.replace(year, years.get(year) + 1);
          } else {
            years.put(year, 0);
          }
        }
        for (Integer key : years.keySet()){
          if (years.get(key)>years.get(year)){
            year=key;
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return year;
  }
}