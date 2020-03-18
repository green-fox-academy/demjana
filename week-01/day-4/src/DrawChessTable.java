import java.util.Scanner;

public class DrawChessTable {
  // Crate a program that draws a chess table like this
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Define the value of the x-axis: ");
    int x = scanner.nextInt();
    System.out.print("Define the value of the y-axis: ");
    int y = scanner.nextInt();

    for (int i = 0; i < y; i++) {
      for (int j = 0; j < x; j++) {
        if (i % 2 != 0) {
          System.out.print(" %");
        } else {
          System.out.print("% ");
        }
      }
      System.out.println("");
    }
  }
}

