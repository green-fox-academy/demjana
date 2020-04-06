import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main(String[] args) {

    HashMap<String, Double> products = new HashMap<>();
    products.put("Milk", 1.07);
    products.put("Rice", 1.59);
    products.put("Eggs", 3.14);
    products.put("Cheese", 12.60);
    products.put("Chicken Breasts", 9.40);
    products.put("Apples", 2.31);
    products.put("Tomato", 2.58);
    products.put("Potato", 1.75);
    products.put("Onion", 1.10);

    HashMap<String, Double> bobsShoppingList = new HashMap<>();
    bobsShoppingList.put("Milk", 3.);
    bobsShoppingList.put("Rice", 2.);
    bobsShoppingList.put("Eggs", 2.);
    bobsShoppingList.put("Cheese", 1.);
    bobsShoppingList.put("Chicken Breasts", 4.);
    bobsShoppingList.put("Apples", 1.);
    bobsShoppingList.put("Tomato", 2.);
    bobsShoppingList.put("Potato", 1.);

    HashMap<String, Double> alicesShoppingList = new HashMap<>();
    alicesShoppingList.put("Rice", 1.);
    alicesShoppingList.put("Eggs", 5.);
    alicesShoppingList.put("Chicken Breasts", 2.);
    alicesShoppingList.put("Apples", 1.);
    alicesShoppingList.put("Tomato", 10.);

    System.out.println("How much does Bob pay?");
    System.out.println(sumAll(products, bobsShoppingList));
    System.out.println("How much does Alice pay?");
    System.out.println(sumAll(products, alicesShoppingList));
    System.out.println("Who buys more Rice?");

    System.out.println("Who buys more Rice?");
    whoBuyMore(bobsShoppingList, alicesShoppingList, "Rice");

    System.out.println("Who buys more Potato?");
    whoBuyMore(bobsShoppingList, alicesShoppingList, "Potato");

    System.out.println("Who buys more products? (piece)");
    if (sumAllPieces(bobsShoppingList) < sumAllPieces(alicesShoppingList)) {
      System.out.println("Alice brought more product");
    } else if (sumAllPieces(bobsShoppingList) > sumAllPieces(alicesShoppingList)) {
      System.out.println("Bob brought more product");
    } else {
      System.out.println("==");
    }

    whoBuyMoreDifferentProduct(bobsShoppingList,alicesShoppingList);



  }

  public static double sumAll(HashMap<String, Double> template, HashMap<String, Double> shoppingList) {
    double sum = 0;
    for (Map.Entry<String, Double> shoppingProduct : shoppingList.entrySet()) {
      sum += (template.get(shoppingProduct.getKey()) * shoppingProduct.getValue());
    }
    return sum;
  }

  public static void whoBuyMore(HashMap<String, Double> inputMap1, HashMap<String, Double> inputMap2, String key) {
    if (inputMap1.containsKey(key) && inputMap2.containsKey(key)) {
      if (inputMap1.get(key) > inputMap2.get(key)) {
        System.out.println("The first buyer bought more!");
      } else if (inputMap1.get(key) < inputMap2.get(key)) {
        System.out.println("The second buyer bought more!");
      } else {
        System.out.println("They bought the same amount!");
      }
    } else {
      if (inputMap1.containsKey(key)) {
        System.out.println("The first buyer bought more, because the second buyer didn't buy!");
      } else {
        System.out.println("The second buyer bought more, because the first buyer didn't buy!");
      }
    }
  }

  public static double sumAllPieces(HashMap<String, Double> inputMap) {
    double sum = 0;
    for (Map.Entry<String, Double> piece : inputMap.entrySet()) {
      sum += piece.getValue();
    }
    return sum;
  }

  public static void whoBuyMoreDifferentProduct(HashMap<String, Double> inputMap1, HashMap<String, Double> inputMap2) {
    if (inputMap1.size() > inputMap2.size()) {
      System.out.println("The first buyer bought more different products!");
    } else if (inputMap1.size() < inputMap2.size()) {
      System.out.println("The second buyer bought more more different products!");
    } else {
      System.out.println("They bought the same amount more different products!");
    }
  }
}