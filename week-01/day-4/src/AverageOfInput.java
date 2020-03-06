import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, e;

        System.out.println("1.Number:");
        a  = scanner.nextInt();

        System.out.println("2.Number:");
        b  = scanner.nextInt();

        System.out.println("3.Number:");
        c  = scanner.nextInt();

        System.out.println("4.Number:");
        d  = scanner.nextInt();

        System.out.println("5.Number:");
        e  = scanner.nextInt();

         int sum = a + b + c + d + e;
        System.out.println("Sum of the numbers:" + sum);

        int average = ((a+b+c+d+e)/5);
        System.out.println("Average of the numbers: " + average);
    }
}
