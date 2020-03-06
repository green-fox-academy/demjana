import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Number:");
        int x = number.nextInt();
        int Even = x % 2;
        if (Even == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");

        }







    }
}
