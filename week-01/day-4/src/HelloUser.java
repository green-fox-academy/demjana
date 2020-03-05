import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Userame:");
        Scanner scanner = new Scanner(System.in);
        String HelloUser = scanner.nextLine();
        System.out.println("Hello, " + HelloUser);
    }
}
