package Farm;

import Animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> listOfAnimals;
  int numberOfFreePlaces;

  public Farm() {
    numberOfFreePlaces = 10;
    listOfAnimals = new ArrayList<>();
  }

  public void breed() {
    if (numberOfFreePlaces > 0) {
      listOfAnimals.add(new Animal());
      numberOfFreePlaces--;
    }
  }

  public void slaughter() {
    int leastHungryAnimal = 0;
    for (int i = 1; i < listOfAnimals.size(); i++) {
      if (listOfAnimals.get(i).hunger < listOfAnimals.get(leastHungryAnimal).hunger) {
        leastHungryAnimal = i;
      }
    }
    listOfAnimals.remove(leastHungryAnimal);
    numberOfFreePlaces++;
  }
}
