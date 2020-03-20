package SharpieSet;

import Sharpie.Sharpie;
import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {
    this.sharpies = new ArrayList<>();
  }

  public int countUsable() {
    int counter = 0;
    for (Sharpie sharpie : this.sharpies) {
      if (sharpie.inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }

  public void removeTrash() {
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).inkAmount == 0) {
        sharpies.remove(i);
        i--; // after remove an element this set the size of list
      }
    }
  }
}
