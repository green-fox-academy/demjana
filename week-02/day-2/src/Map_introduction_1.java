import java.util.HashMap;
import java.util.Map;

public class Map_introduction_1 {
  public static void main(String[] args) {
    HashMap<Integer, Character> hm = new HashMap<>();

    hm.put(97, 'a');
    hm.put(98, 'b');
    hm.put(99, 'c');
    hm.put(65, 'A');
    hm.put(66, 'B');
    hm.put(67, 'C');
    hm.put(68, 'D');

    // Show me the keys:
    for (Integer key : hm.keySet()) {
      System.out.println(key);
    }
    // Show me the values:
    for (Character values : hm.values()) {
      System.out.println(values);
    }

    // Get keys and values together:
    for (Map.Entry<Integer, Character> item : hm.entrySet()) {
      item.getKey();
      item.getValue();
    }
    System.out.println(hm);
    // Print how many key-value pairs are in the map
    System.out.println(hm.size());

    // Print the value that is associated with key 99
    System.out.println(hm.get(99));

    hm.remove(97);
    System.out.println(hm);

    //Check if key already exists:
    if (hm.containsKey(100)) {
      System.out.println(hm.get(100));
    } else {
      System.out.println("Nope");
    }

    hm.clear();
    System.out.println(hm);
  }
}
