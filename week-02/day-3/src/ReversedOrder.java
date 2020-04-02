import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
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
    int maxLineIndex = lines.size() - 1;
    for (int i = 0; i < lines.size(); i++) {
      decryptLines.add(lines.get(maxLineIndex));
      maxLineIndex--;
    }

    try {
      Files.write(output, decryptLines);
    } catch (IOException e) {
      System.out.println("The output file does not exists.");
    }
  }
}