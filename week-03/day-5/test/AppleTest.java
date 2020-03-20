import static org.junit.Assert.*;

import appeles.Apple;
import org.junit.Test;

public class AppleTest {

  Apple apple = new Apple();

  @Test
  public void getApple_Should_ReturnsEquals() {
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void getApple_Should_ReturnsNotEquals() {
    assertNotEquals("aple", apple.getApple());
  }
}