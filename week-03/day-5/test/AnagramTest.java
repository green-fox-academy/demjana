import static org.junit.Assert.*;

import anagram.Anagram;
import org.junit.Test;

public class AnagramTest {

  @Test
  public void anagramsOrNot__WithTwoAnagrams_ReturnTrue() {
    Anagram anagram = new Anagram();
    boolean result = anagram.anagramsOrNot("castle", "cleats");
    assertEquals(true, result);
  }

  @Test
  public void anagramsOrNot__WithTwoAnagrams_Returnfalse() {
    Anagram anagram = new Anagram();
    boolean result = anagram.anagramsOrNot("castle", "tales");
    assertEquals(false, result);
  }

  @Test
  public void anagramsOrNot__WithTwoNotAnagramsWithSameSize_Returnfalse() {
    Anagram anagram = new Anagram();
    boolean result = anagram.anagramsOrNot("castle", "teslaS");
    assertEquals(false, result);
  }










}