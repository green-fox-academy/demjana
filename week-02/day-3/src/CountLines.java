import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (NoSuchFileException e) {
            System.out.println("Unable to read file: my-file.txt");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    private static void readFile() throws IOException {
        Path path = Paths.get("textFiles/my-file.txt");
        List<String> lines = Files.readAllLines(path);
        int size = lines.size();
        System.out.println(size);
    }
}