import java.util.ArrayList;
import java.util.Arrays;

public class List_introduction_2 {
  public static void main(String[] args) {
    ArrayList<String> listA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
    ArrayList<String> listB = new ArrayList<>(listA);
      //
      System.out.println(listA.contains("Durian"));
      //
      listB.remove("Durian");
      System.out.println(listB);
      //
      listA.add(3, "Kiwifruit ");
      System.out.println(listA);
      //compare:
      System.out.println(listA.equals(listB));
      //
      System.out.println(listA.indexOf("Avocado"));
      //
      System.out.println(listB.indexOf("Durian"));
      // Add things to ListB in a single statement
      listB.addAll(Arrays.asList("PassionFruit", "Pomelo"));
      System.out.println(listB);
      //
      System.out.println(listA.get(2));
  }
}
