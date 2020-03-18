public class VariableMutation {
  public static void main(String[] args) {
    int a = 3;
    a += 8;
    System.out.println(a);
    //
    int b = 100;
    b -= 7;
    System.out.println(b);
    //
    int c = 44;
    c *= 2;
    System.out.println(c);
    //
    int d = 125;
    d /= 5;
    System.out.println(d);
    //
    int f1 = 123;
    int f2 = 345;
    System.out.println((boolean) (f1 > f2));
    //
    int g1 = 350;
    int g2 = 200;
    System.out.println((boolean) (2 * g2 > g1));
    //
    int i1 = 10;
    int i2 = 3;
    System.out.println((boolean) (g2 * g2 > g1 * g1 * g1));
    //
    int h = 135798745;
    System.out.println((boolean) (h / 11 == 0));
    System.out.println(h % 11);
    //
    // tell if j is dividable by 3 or 5 (print as a boolean)
    int j = 1521;
    int x = j % 3;
    int y = j % 5;
    System.out.println(x);
    System.out.println(y);
    System.out.println((boolean) (x == 0));
    System.out.println((boolean) (y == 0));
    System.out.println((boolean) (x == 0) || (y == 0));
  }
}
