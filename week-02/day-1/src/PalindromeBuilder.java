// Create a function named create palindrome following your current language's style guide.
// It should take a string, create a palindrome from it and then return it.
//Examples: input	      output
//          "greenfox"	"greenfoxxofneerg"
//          "123"	      "123321"

public class PalindromeBuilder {
  public static void main(String[] args) {
    String word = "greenfox";
    String number = "123";
    System.out.println(createPalindrome(word));
    System.out.println(createPalindrome(number));
  }

  public static char[] createPalindrome(String word) {
    char[] palindrome = new char[word.length() * 2];
    int j = 0;
    for (int i = 0; i < word.length(); i++) {
      palindrome[j] = word.charAt(i);
      j++;
    }
    for (int i = word.length() - 1; i >= 0; i--) {
      palindrome[j] = word.charAt(i);
      j++;
    }
    return palindrome;
  }
}