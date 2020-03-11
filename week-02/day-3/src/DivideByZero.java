import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        divideByZero();
        System.out.println();
    }

    private static void divideByZero() {
        Scanner scanner = new Scanner(System.in);
        try {
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("Result of division is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Reached finally");
        }
    }
}
