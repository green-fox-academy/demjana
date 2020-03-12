import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    private static void writeFile() {
        List<String> lines = new ArrayList<>();
        int number = 6;
        String word = "apple";

        try {
            Path filePath = Paths.get("assets/my-file.txt");
            for (int i = 0; i < number; i++) {
                lines.add(word);
            }
            Files.write(filePath, lines);

        } catch (Exception e) {
            System.out.println("I could not write the file!");
        }
    }

    private static void readFile() {
        try {
            Path filePath = Paths.get("assets/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println((lines));
        } catch (Exception e) {
            System.out.println("I could not read the file!");
        }
    }
}