import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        try {
            readFile();
            writeFile();
        } catch (NoSuchFileException e) {
            System.out.println("Unable to read file: my-file.txt");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IoException");
            //e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            //e.printStackTrace();
        }
        System.out.println("Method finished");
    }

    private static void writeFile() throws IOException {
        Path path = Paths.get("textFiles/my-file.txt");
        List<String> lines = readFile();
        List<String> modifiedLines =

    }
}