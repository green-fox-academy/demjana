import static org.junit.Assert.*;

import countLetters.CountLetters;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class CountLettersTest {

  CountLetters dictionary;
  Map<Character, Integer> letters;
  String text;

  @Test
  public void letterCounter_OneWord_ReturnsTrue() {
    dictionary = new CountLetters();
    letters = new HashMap<>();
    text = "apple";
    letters.put('a', 1);
    letters.put('p', 2);
    letters.put('l', 1);
    letters.put('e', 1);
    assertTrue(letters.equals(dictionary.letterCounter(text)));
  }

  @Test
  public void letterCounter_OneWordWithCapitals_ReturnsTrue() {
    dictionary = new CountLetters();
    text = "CoffeE";
    letters = new HashMap<>();
    letters.put('c', 1);
    letters.put('o', 1);
    letters.put('f', 2);
    letters.put('e', 2);
    assertTrue(letters.equals(dictionary.letterCounter(text)));
  }

  @Test
  public void letterCounter_MoreWordWithSpacesAndCapitals_ReturnsTrue() {
    dictionary = new CountLetters();
    text = "WEIRD world";
    letters = new HashMap<>();
    letters.put('w', 2);
    letters.put('e', 1);
    letters.put('i', 1);
    letters.put('r', 2);
    letters.put('d', 2);
    letters.put('o', 1);
    letters.put('l', 1);
    assertTrue(letters.equals(dictionary.letterCounter(text)));
  }

  @Test
  public void letterCounter_WholeSentencesWithSpecialCharacters_ReturnsTrue() {
    dictionary = new CountLetters();
    text = "Word OR world????!!4";
    letters = new HashMap<>();
    letters.put('w', 2);
    letters.put('o', 3);
    letters.put('r', 3);
    letters.put('l', 1);
    letters.put('d', 2);
    assertTrue(letters.equals(dictionary.letterCounter(text)));
  }

  @Test
  public void letterCounter_EmptyString_ReturnsTrue() {
    dictionary = new CountLetters();
    text = "";
    letters = new HashMap<>();
    assertTrue(letters.equals(dictionary.letterCounter(text)));
  }

  @Test
  public void letterCounter_NullString_ReturnsTrue() {
    dictionary = new CountLetters();
    letters = new HashMap<>();
    assertEquals(null, dictionary.letterCounter(text));
  }
}