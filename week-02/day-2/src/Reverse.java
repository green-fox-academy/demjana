public class Reverse {
  public static void main(String... args) {
    String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println("String to reverse:");
    System.out.println(toBeReversed);

    String reverse = "";
    for (int i = toBeReversed.length() - 1; i >= 0; i--) {
      reverse = reverse + toBeReversed.charAt(i);
    }
    System.out.println("Reversed string is:");

    System.out.println(reverse);
  }
}
