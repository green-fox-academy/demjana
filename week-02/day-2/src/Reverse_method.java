public class Reverse_method {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(reverse(toBeReversed));
    }

    public static String reverse(String toBeReversed) {
        String x = "";
        for (int i = toBeReversed.length() - 1; i >= 0; i--) {
            x = x + toBeReversed.charAt(i);
        }
        return x;
    }
}