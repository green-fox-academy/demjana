import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (NoSuchFileException e) {
            System.out.println("Unable to read file: my-file.txt");
            //e.printStackTrace(); // ha ez itt van kidobja az összes hibát pirossal
        } catch (IOException e) {
            System.out.println("IoException");
            //e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            //e.printStackTrace();
        }
        System.out.println("Method finished");
    }

    private static void readFile() throws IOException {
        Path path = Paths.get("textFiles/my-file.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
        }
        //return lines;
    }
}
// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"