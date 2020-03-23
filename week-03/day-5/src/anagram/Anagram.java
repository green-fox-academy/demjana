package anagram;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
  public boolean anagramsOrNot(String first, String second) {
    if (first.length() != second.length()) {
      return false;
    } else {

      List<Character> firstChars = new ArrayList<>();
      for (char c : first.toCharArray()) {
        firstChars.add(c);
      }

      List<Character> secondChars = new ArrayList<>();
      for (char c : second.toCharArray()) {
        secondChars.add(c);
      }

      for (int i = 0; i < firstChars.size(); i++) {
        if (secondChars.contains(firstChars.get(i))) {
          secondChars.remove(secondChars.indexOf(firstChars.get(i)));
          firstChars.remove(i);
          i = -1;
        }
      }

      if (firstChars.size() == 0 && secondChars.size() == 0) {
        return true;
      } else {
        return false;
      }
    }
  }

}
