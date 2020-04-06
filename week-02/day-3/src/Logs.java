import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Spliterator;

public class Logs {
  public static void main(String[] args) {
    Path filePath = Paths.get("assets/log.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String ip : addresses(lines)) {
        System.out.println(ip);
      }
      System.out.println("GET/POST ratio: " + ratio(lines));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String[] addresses(List<String> list) {
    String[] ipAddress = new String[list.size()];
    String[] oneLine;
    for (int i = 0; i < list.size(); i++) {
      oneLine = list.get(i).split("   ");
      ipAddress[i] = oneLine[1];
    }
    return ipAddress;
  }

  public static double ratio(List<String> list) {
    String oneLine;
    double numberOfGet = 0;
    double numberOfPost = 0;
    for (int i = 0; i < list.size(); i++) {
      oneLine = list.get(i);
      if (oneLine.contains("GET")) {
        numberOfGet++;
      }else {
        numberOfPost++;
      }
    }
return numberOfGet/numberOfPost;
  }
}
