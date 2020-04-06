import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(numberSearcher("assets/lottery.csv")));
  }

  private static int[] numberSearcher(String fileName) {
    Path filePath = Paths.get(fileName);
    String[] oneLine;
    int[] numbers = new int[5];
    Map<Integer, Integer> lotteryNumbers = new HashMap<>();
    int biggestKey = 0;
    int biggestValue;
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        oneLine = line.split(";");
        for (int j = 0, k = oneLine.length - 5; k < oneLine.length; j++, k++) {
          numbers[j] = Integer.parseInt(oneLine[k]);
        }
        for (int j = 0; j < 5; j++) {
          if (lotteryNumbers.containsKey(numbers[j])) {
            lotteryNumbers.replace(numbers[j], lotteryNumbers.get(numbers[j]) + 1);
          } else {
            lotteryNumbers.put(numbers[j], 1);
          }
        }
      }
      for (int i = 0; i < 5; i++) {
        biggestValue = 0;
        for (Map.Entry<Integer, Integer> item : lotteryNumbers.entrySet()) {
          if (item.getValue() > biggestValue) {
            biggestValue = item.getValue();
            biggestKey = item.getKey();
          }
        }
        numbers[i] = biggestKey;
        lotteryNumbers.remove(biggestKey);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return numbers;
  }
}