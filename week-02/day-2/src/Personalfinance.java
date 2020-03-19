import java.util.ArrayList;
import java.util.Arrays;

public class Personalfinance {
  public static void main(String[] args) {
    ArrayList<Integer> ourExpenses = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
    //
    System.out.println("How much did we spend?");
    System.out.println(sumAll(ourExpenses));
    //
    System.out.println();
    //
    System.out.println("Which was our greatest expense?");
    System.out.println(greatestExpense(ourExpenses));
    //
    System.out.println();
    //
    System.out.println("Which was our cheapest spending?");
    System.out.println(cheapestSpending(ourExpenses));
    //
    System.out.println();
    //
    System.out.println("What was the average amount of our spendings?");
    System.out.println(averageSpending(ourExpenses));
  }

  public static int sumAll(ArrayList<Integer> inputList) {
    int sum = 0;
    for (int i : inputList) {
      sum += i;
    }
    return sum;
  }

  public static int greatestExpense(ArrayList<Integer> inputList) {
    int max = inputList.get(0);
    for (int i = 1; i < inputList.size(); i++) {
      if (inputList.get(i) > max) {
        max = inputList.get(i);
      }
    }
    return max;
  }

  public static int cheapestSpending(ArrayList<Integer> inputList) {
    int min = inputList.get(0);
    for (int i = 1; i < inputList.size(); i++) {
      if (inputList.get(i) < min) {
        min = inputList.get(i);
      }
    }
    return min;
  }
  public static double averageSpending(ArrayList<Integer> inputList) {
    double sum = sumAll(inputList);
    return sum/inputList.size();
  }
}