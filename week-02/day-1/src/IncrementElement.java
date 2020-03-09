import java.util.Arrays;

public class IncrementElement {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            if (i == number[2]) {
                number[2] += 234;
                System.out.println(number[2]);
            }
        }
        number[3]++;
        System.out.println(number[3]);

        number[4] += 432;
        System.out.println(number[4]);
        System.out.println(Arrays.toString(number));
    }
}


