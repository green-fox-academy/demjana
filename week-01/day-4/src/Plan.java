public class Plan {
  public static void main(String[] args) {
    int x = 4;
    for (int i = 1; i <= x; i++) {
      System.out.print(".");
      for (int j = 1; j <= x; j++) {
        System.out.println("*");
      }
    }
  }
}
