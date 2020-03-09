import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me an integer: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*a=5
1->4
2->3
3->2
4->1
5->0*/