import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_introduction_2 {
  public static void main(String[] args) {
    LinkedHashMap<String, String> myMap = new LinkedHashMap<>();
    myMap.put("978-1-60309-452-8", "A Letter to Jo");
    myMap.put("978-1-60309-459-7", "Lupus");
    myMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    myMap.put("978-1-60309-461-0", "The Lab");

    for (Map.Entry<String, String> entry : myMap.entrySet()) {
      System.out.println(entry.getValue() + "(ISBN" + entry.getKey() + ")");
    }
    System.out.println("");
    // Remove the key-value pair with key 978-1-60309-444-3
    myMap.remove("978-1-60309-444-3");
    System.out.println("");
    // Print
    for (Map.Entry<String, String> entry : myMap.entrySet()) {
      System.out.println(entry.getValue() + "(ISBN" + entry.getKey() + ")");
    }
    System.out.println("");

    // Remove the key-value pair with value The Lab
    String keyToRemove = "";
    for (Map.Entry<String, String> entry : myMap.entrySet()) {
      if (entry.getValue().equals("The Lab")) {
        keyToRemove = entry.getKey();
      }
    }
    myMap.remove(keyToRemove);

    // Print
    for (Map.Entry<String, String> entry : myMap.entrySet()) {
      System.out.println(entry.getValue() + "(ISBN" + entry.getKey() + ")");
    }
    System.out.println("");
    //
    myMap.put("978-1-60309-450-4", "They Called Us Enemy");
    myMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

    // Print whether there is an associated value with key 478-0-61159-424-8 or not
    System.out.println(myMap.containsKey("478-0-61159-424-8"));

    // Print the value associated with key 978-1-60309-453-5
    System.out.println(myMap.get("978-1-60309-453-5"));
  }
}
