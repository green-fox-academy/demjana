import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of Cubiod:");
        double l = s.nextDouble();
        System.out.println("Enter the breadth of Cubiod:");
        double b = s.nextDouble();
        System.out.println("Enter height of Cubiod:");
        double h = s.nextDouble();
        double volume = l * b * h;
        System.out.println("Volume Of Cuboid is: " + volume);
        double surfaceArea = 2 * l * b + 2 * l * h + 2 * h * b;
        System.out.println("Surface area of Cuboid is: " + surfaceArea);
    }
}