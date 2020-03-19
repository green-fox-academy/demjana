import java.util.ArrayList;
import java.util.Iterator;

public class List_introduction_1 {
  public static void main(String[] args) {

    //Create an empty list which will contain names (strings)
    ArrayList<String> myList = new ArrayList<>();

    //Print out the number of elements in the list

    //Add people to the list
    myList.add("William");
    myList.add("John");
    myList.add("Amanda");

    System.out.println(myList);

    int size = myList.size();
    System.out.println(size);

    System.out.println(myList.get(2));

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(i + 1 + "." + myList.get(i));
    }
    myList.remove(1);
    System.out.println(myList);

    for (int i = myList.size() - 1; i >= 0; i--) {
      System.out.println(myList.get(i));
    }
    myList.clear();
    System.out.println(myList);
  }
}
