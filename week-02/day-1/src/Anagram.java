// Create a function named is anagram following your current language's style guide.
// It should take two strings and return a boolean value depending on whether its an anagram or not.
// Examples:
//     input 1    input 2    output
//     "dog"	     "god"	    true
//     "green"	   "fox"	    false

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String word1 = "eleven plus two";
    String word2 = "elneve plsu wot";
    System.out.println(isAnagram(word1, word2));
  }

  public static boolean isAnagram(String str1, String str2) {
    int spaceCounter = 0;
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == ' ') {
        spaceCounter++;
      }
    }
    char[] word1 = new char[str1.length() - spaceCounter];

    spaceCounter = 0;
    for (int i = 0; i < str2.length(); i++) {
      if (str1.charAt(i) == ' ') {
        spaceCounter++;
      }
    }
    char[] word2 = new char[str2.length() - spaceCounter];

    if (word1.length != word2.length) {
      return false;
    }

    for (int i = 0, j = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != ' ') {
        word1[j] = str1.charAt(i);
        j++;
      }
    }

    for (int i = 0, j = 0; i < str1.length(); i++) {
      if (str2.charAt(i) != ' ') {
        word2[j] = str2.charAt(i);
        j++;
      }
    }

    Arrays.sort(word1);
    Arrays.sort(word2);
    return Arrays.equals(word1, word2);
  }
}