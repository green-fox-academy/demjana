import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    System.out.println("1. Userame:");
    Scanner scanner = new Scanner(System.in);
    String HelloUser = scanner.nextLine();
    System.out.println("Hello, " + HelloUser);
    System.out.println("2. Userame:");
    String otherUser = scanner.nextLine();
    System.out.println("Hello, " + HelloUser + " and " + otherUser);

  }
}
