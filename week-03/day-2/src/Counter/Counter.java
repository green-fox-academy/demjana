package Counter;

public class Counter {
  int value;
  int defaultValue;

  public Counter() {
    this.value = 0;
    this.defaultValue = 0;
  }

  public Counter(int value) {
    this.value = value;
    defaultValue = value;
  }

  public void add(int numberToAdd) {
    this.value += numberToAdd;
  }

  public void add() {
    this.value++;
  }

  public int get() {
    return value;
  }

  public void reset() {
    this.value = defaultValue;
  }


}
