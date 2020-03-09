import java.util.Arrays;

public class ChangeElement {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 8, 5, 6};

        int n = 8;
        int n2 = 4;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == n) {
                number[i] = n2;
            }
        }
        System.out.println(number[3]);
        System.out.println(Arrays.toString(number));
    }
}
