import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int a = scanner.nextInt();
        System.out.println("Second number:");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (a < b) {
                System.out.println(i);
            }
        }
        for (int j = 1; j < 2 ; j++) {
            if (a > b) {
                System.out.println("The second number should be bigger!");
            }
        }
    }
}