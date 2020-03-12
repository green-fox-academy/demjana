public class TakesLonger {
    public static void main(String... args) {
        StringBuilder quote = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");

        String paste = " always takes longer than";

        int n = quote.indexOf("y");

        quote.insert(n - 1, paste);

        System.out.println(quote);

    }
}