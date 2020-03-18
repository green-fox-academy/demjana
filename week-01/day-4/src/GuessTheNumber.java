import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8
    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number: ");
    int storedNumber  = scanner.nextInt();
    int guess;
    boolean gameOver = false;

    while (!gameOver){
      System.out.println("What is your guess?");
      guess = scanner.nextInt();

      if (guess > storedNumber ){
        System.out.println("The stored  number is lower!");
      } else if (guess < storedNumber ){
        System.out.println("The stored  number is higher!");
      } else {
        System.out.println("You found the number: " + storedNumber);
        gameOver = true;
      }
    }
  }
}
