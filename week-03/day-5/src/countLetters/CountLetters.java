package countLetters;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public Map<Character, Integer> letterCounter(String text) {
    if (text == null) {
      return null;
    }

    Map<Character, Integer> letters = new HashMap<>();
    String abc = "öüóqwertzuiopőúasdfghjkléáűíyxcvbnm";
    text = text.toLowerCase();

    for (char character : text.toCharArray()) {
      if (abc.contains(Character.toString(character))) {
        if (letters.containsKey(character)) {
          letters.replace(character, letters.get(character) + 1);
        } else {
          letters.put(character, 1);
        }
      }
    }
    return letters;
  }
}
