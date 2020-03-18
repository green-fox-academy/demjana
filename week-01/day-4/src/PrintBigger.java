import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {

    for (int i = 0; i < 3; i++) {

      Scanner scanner = new Scanner(System.in);
      System.out.println("Type the the first number:");
      int a = scanner.nextInt();
      System.out.println("Type the second number:");
      int b = scanner.nextInt();

      if (a > b) {
        System.out.println(a + " is bigger than " + b);
      } else if (a == b) {
        System.out.println(a + " and " + b + " are equal");
      } else {
        System.out.println(b + " is bigger than " + a);
      }
    }
  }
}
