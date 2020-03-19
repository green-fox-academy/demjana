public class Factorio {
  public static void main(String[] args) {
    int num = 4;
    System.out.println(sum(num));
  }

  public static int sum(int num) {
    int sum = 1;
    for (int i = 1; i <= num; i++) {
      sum *= i;
    }
    return sum;
  }
}
