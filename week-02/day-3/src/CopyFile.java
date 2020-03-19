import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    copyContents();
  }

  private static boolean copyContents() {
    Path filePath1 = Paths.get("assets/my-file.txt");
    Path filePath2 = Paths.get("assets/new-file.txt");

    try {
      List<String> lines = Files.readAllLines(filePath1);
      Files.write(filePath2, lines);
      System.out.println((lines));
      return true;

    } catch (IOException e) {
      System.out.println("IOException");
      return false;
    }
  }
}

