import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner miles = new Scanner(System.in);
        System.out.println("Miles to kilometres Converter");
        System.out.println("Enter the Miles:");
        double x = miles.nextDouble();
        double kilometres = x * 1.609344;
        System.out.println("Miles in Kilometres: " + kilometres);


    }
}
