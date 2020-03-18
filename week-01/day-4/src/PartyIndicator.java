import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number of girls:");
    int girls = scanner.nextInt();
    System.out.println("Number of boys:");
    int boys = scanner.nextInt();

    if (girls == boys && (girls + boys) >= 20) {
      System.out.println("The party is excellent!");

    } else if (girls != boys && (girls + boys) >= 20) {
      System.out.println("Quite cool party!");

    } else if ((girls != 0) && (girls + boys) < 20) {
      System.out.println("Average party...");

    } else {
      System.out.println("Sausage party");
    }
  }
}
