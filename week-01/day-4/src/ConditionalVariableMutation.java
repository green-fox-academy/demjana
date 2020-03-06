public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;

        if (a % 2 == 0) {
            out += 1;
        }
        System.out.println(out);

        // if credits are at least 50,
        // AND isBonus is false THEN decrement c by 2
        // else if credits are smaller than 50,
        // AND isBonus is false THEN decrement c by 1
        // ELSE IF isBonus is true THEN c should remain the same

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if (credits >= 50 && !isBonus) {
            c -= 2;
        }
        System.out.println(c);
    }
}
