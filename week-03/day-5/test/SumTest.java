import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import sum.Sum;

public class SumTest {

  @Test
  public void getSum_WithPositiveValues_ReturnsValid() {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2, 10));
    int sumResult = sum.getSum(numbers);
    assertEquals(20, sumResult);
  }

  @Test
  public void getSum_WithEmptyList_ReturnsZero() {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList());
    int sumResult = sum.getSum(numbers);
    assertEquals(0, sumResult);
  }

  @Test
  public void getSum_WithOneElement_ReturnsThatElement() {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3));
    int sumResult = sum.getSum(numbers);
    assertEquals(3, sumResult);
  }

  @Test
  public void getSum_WithMultipleValues_ReturnsValid() {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 2, 2, 2, -5, 10));
    int sumResult = sum.getSum(numbers);
    assertEquals(13, sumResult);
  }

  @Test
  public void getSum_WithNull_ReturnsValid() {
    Sum sum = new Sum();
    ArrayList<Integer> numbers = null;
    assertEquals(0, sum.getSum(numbers));
  }
}