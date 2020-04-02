import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    decryptTheFile("assets/duplicated-chars.txt",
        "assets/fixed-duplicated-chars.txt");
  }

  public static void decryptTheFile(String filename, String outputFilename) {
    Path inputFile = Paths.get(filename);
    Path outputFile = Paths.get(outputFilename);
    List<String> lines = new ArrayList<>();

    try {
      lines = Files.readAllLines(inputFile);
    } catch (IOException e) {
      System.out.println("The input file does not exists.");
      e.printStackTrace();
    }

    List<String> decryptLines = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      String line = lines.get(i);
      String newLine = "";
      for (int j = 0; j < line.length(); j++) {
        if (j % 2 != 0) {
          newLine = newLine.concat(line.charAt(j) + "");
        }
      }
      decryptLines.add(newLine);
    }

    try {
      Files.write(outputFile, decryptLines);
    } catch (IOException e) {
      System.out.println("The output file does not exists.");
    }
  }
}

