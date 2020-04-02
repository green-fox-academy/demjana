import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    decryptTheFile("assets/reversed-lines.txt",
        "assets/fixed-reversed-lines.txt");
  }

  public static void decryptTheFile(String inputFilename, String outputFilename) {
    Path input = Paths.get(inputFilename);
    Path output = Paths.get(outputFilename);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(input);
    } catch (IOException e) {
      System.out.println("The input file does not exists.");
      e.printStackTrace();
    }

    List<String> decryptLines = new ArrayList<>();
    for (String line : lines) {
      String reservedLine = "";
      for (int i = line.length() - 1; i > 0; i--) {
        reservedLine = reservedLine.concat(line.charAt(i) + "");
      }
      decryptLines.add(reservedLine);
    }

    try {
      Files.write(output, decryptLines);
    } catch (IOException e) {
      System.out.println("The output file does not exists.");
    }
  }
}
