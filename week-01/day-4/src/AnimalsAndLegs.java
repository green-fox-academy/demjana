import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner animalsAndLegs = new Scanner(System.in);

        System.out.println("Number of chickens:");
        int chickens = animalsAndLegs.nextInt();
        System.out.println("Number of cows:");
        int cows = animalsAndLegs.nextInt();
        System.out.println("Number of chickens:");
        int pigs = animalsAndLegs.nextInt();

        int legs = (chickens*2) + (cows*4) + (pigs*4);
        System.out.println("Number of legs: " + legs);

        int tails = pigs + cows;
        System.out.println("Number of tails:" + tails);



    }
}
