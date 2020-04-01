package printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    List<Todo> todos = new ArrayList<>();
    dominoes.add(new Domino(3, 2));
    dominoes.add(new Domino(2, 5));
    todos.add(new Todo("Feed the dog!", Priority.high, true));
    todos.add(new Todo("Buy milk!", Priority.low, false));

    for (Domino d : dominoes) {
      d.printAllFields();
    }

    for (Todo t : todos) {
      t.printAllFields();
    }
  }
}
