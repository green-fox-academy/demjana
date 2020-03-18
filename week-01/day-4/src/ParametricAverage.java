import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers you want to add?\n Enter a number: ");
    int number = scanner.nextInt();

    int sum = 0;
    float average = 0;

    for (int i = 0; i < number; i++) {
      System.out.print("Type the " + (i+1) + ". number: "  );
      int values = scanner.nextInt();
      sum = sum + values;
      average = (average + values)/number;
    }
    System.out.println("Sum: " + sum);
    System.out.printf("Average: %.2f", average);
  }
}
