import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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


    System.out.println("What is the average price?");


    System.out.println("How many products' price is below 300?");


    System.out.println("Is there anything we can buy for exactly 125?");


    System.out.println("What is the cheapest product?");


  }

  public static int sumAll(HashMap<String, Integer> inputMap) {
    int sum = 0;
    for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
      sum += entry.getValue();
    }
    return sum;
  }
}