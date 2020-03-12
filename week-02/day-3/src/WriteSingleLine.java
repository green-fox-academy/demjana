import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    private static void writeFile() {
        List<String> content = new ArrayList<>();
        content.add("Akos Demjan");

        try {
            Path filePath = Paths.get("assets/new-file.txt");
            Files.write(filePath, content);

        } catch (Exception e) {
            System.out.println("I could not write the file!");
        }
    }

    private static void readFile() {
        try {
            Path filePath = Paths.get("assets/new-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}
