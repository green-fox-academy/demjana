public class Summing {
  public static void main(String[] args) {
    int num = 4;
    System.out.println(sum(num));
  }

  public static int sum(int num) {
    int sum = 0;
    for (int i = 0; i <= num; i++) {
      sum = sum + i;
    }
    return sum;
  }
}

