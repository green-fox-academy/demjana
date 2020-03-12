public class TodoPrint {
    public static void main(String... args) {
        StringBuilder todoText = new StringBuilder();

        todoText.insert(0, "My todo:\n");

        todoText.append(" - Buy milk\n");
        todoText.append(" - Download games\n");
        todoText.append("\t - Diablo");

        System.out.println(todoText);
    }
}
// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo
