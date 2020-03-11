import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileIOMain {
    public static void main(String[] args) {
        try {
            readFile();
            writeFile();
        } catch (NoSuchFileException e) {
            System.out.println("No such file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IoException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
        System.out.println("Method finished");
    }

    private static void writeFile() throws IOException {
        Path path = Paths.get("textFiles/animals3.txt");
        List<String> lines = readFile();
        List<String> modifiedLines =
                lines
                        .stream()
                        .filter(f -> f.contains("cat"))
                        .map(line -> line += "Owned by Pityu")
                        .collect(Collectors.toList());

        lines.add("My bluest cat");
        Files.write(path, lines);
    }

    private static List<String> readFile() throws IOException {
        Path path = Paths.get("textFiles/animals.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
        }
        return lines;
    }
}