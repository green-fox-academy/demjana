import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
  public static void main(String[] args) {
    HashMap<String, String> myMap = new HashMap<>();
    myMap.put("William A. Lathan", "405-709-1865");
    myMap.put("John K. Miller", "402-247-8568");
    myMap.put("Hortensia E. Foster", "606-481-6467");
    myMap.put("Amanda D. Newland", "319-243-5613");
    myMap.put("Brooke P. Askew", "307-687-2982");

    System.out.println("What is John K. Miller's phone number?");
    System.out.println(myMap.get("John K. Miller"));
    System.out.println(findPhoneNumber(myMap, "John K. Miller"));
    //
    System.out.println("Do we know Chris E. Myers' phone number?");
    System.out.println(myMap.containsKey("Chris E. Myers'"));
    System.out.println(findPhoneNumber(myMap, "Chris E. Myers"));

    System.out.println("Whose phone number is 307-687-2982?");
    for (String key: myMap.keySet()) {
      if(myMap.get(key).equalsIgnoreCase("307-687-2982")) System.out.println(key);
    }
    System.out.println(findPerson(myMap, "307-687-2982"));
    System.out.println(findPerson(myMap, "333-666-9999"));

  }
  public static String findPhoneNumber(HashMap<String, String> phones, String name) {
    return phones.get(name);

  }
  public static String findPerson(Map<String, String> phones, String phone) {
    for (String key : phones.keySet()) {
      if (phones.get(key).equalsIgnoreCase(phone)) return key;
    }
    return null;
  }

}
