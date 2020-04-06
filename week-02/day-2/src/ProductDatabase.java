import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> database = new HashMap<>();
    database.put("Eggs", 200);
    database.put("Milk", 200);
    database.put("Fish", 400);
    database.put("Apples", 150);
    database.put("Bread", 50);
    database.put("Chicken", 550);

    System.out.println("How much is the fish?");
    System.out.println(database.get("Fish"));

    System.out.println("What is the most expensive product?");
    System.out.println(maxValue(database));

    System.out.println("What is the average price?");
    System.out.println(average(database));

    System.out.println("How many products' price is below 300?");
    System.out.println(below300(database));

    System.out.println("Is there anything we can buy for exactly 125?");
    System.out.println(exactly(database));

    System.out.println("What is the cheapest product?");
    System.out.println(cheapest(database));

    System.out.println("Which products cost less than 201? (just the name)");
    System.out.println(whichProductsLessThan(database, 201));

    System.out.println("Which products cost more than 150? (name + price)");
    System.out.println(whichProductsMoreThan(database, 150));
  }

  public static int maxValue(HashMap<String, Integer> inputMap) {
    int max = 0;
    for (Map.Entry<String, Integer> value : inputMap.entrySet()) {
      if (value.getValue() > max) {
        max = value.getValue();
      }
    }
    return max;
  }

  public static int average(HashMap<String, Integer> inputMap) {
    int sum = 0;
    for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
      sum += entry.getValue();
    }
    return sum / inputMap.size();
  }

  public static int below300(HashMap<String, Integer> inputMap) {
    int counter = 0;
    for (Map.Entry<String, Integer> value : inputMap.entrySet()) {
      if (value.getValue() < 300) {
        counter++;
      }
    }
    return counter;
  }

  public static boolean exactly(HashMap<String, Integer> inputMap) {
    for (Map.Entry<String, Integer> value : inputMap.entrySet()) {
      if (value.getValue().equals(125)) {
        return true;
      }
    }
    return false;
  }

  public static String cheapest(HashMap<String, Integer> inputMap) {
    List<Integer> prizes = new ArrayList<>();
    for (Map.Entry<String, Integer> value : inputMap.entrySet()) {
      prizes.add(value.getValue());
    }
    int min = prizes.get(0);
    for (Integer prize : prizes) {
      if (prize < min) {
        min = prize;
      }
    }
    String cheapest = "";
    for (Map.Entry<String, Integer> value : inputMap.entrySet()) {
      if (value.getValue().equals(min)) {
        cheapest = value.getKey();
      }
    }
    return cheapest;
  }

  public static List<String> whichProductsLessThan(Map<String, Integer> inputMap, int limit) {
    List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> element : inputMap.entrySet()) {
      if (element.getValue() < limit) {
        list.add(element.getKey());
      }
    }
    return list;
  }

  public static List<String> whichProductsMoreThan(Map<String, Integer> inputMap, int limit) {
    List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> element : inputMap.entrySet()) {
      if (element.getValue() > limit) {
        list.add("Product name: " + element.getKey() + "Price: " + element.getValue());
      }
    }
    return list;
  }


}