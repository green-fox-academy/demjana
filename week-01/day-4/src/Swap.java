import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    int a, b;
    a = 123;
    b = 526;
    System.out.println("Before swapping: a, b = " + a + ", " + b);
    //
    // First Solution
    //
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After swapping: a, b = " + a + ", " + b);
    //
    // Second Solution
    //
    a = 123;
    b = 526;
    System.out.println("Before swapping: a, b = " + a + ", " + b);
    //
    b = a + b;
    a = b - a;
    b = b - a;
    System.out.println("After swapping: a, b = " + a + ", " + b);
  }
}
