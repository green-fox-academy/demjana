public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int dayAllSeconds = 24 * 60 * 60;
    System.out.println("Sum seconds of day: " + dayAllSeconds);
    int currentAllSec = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
    System.out.println("Sum current seconds: " + currentAllSec);
    System.out.println("Remaining seconds of the day: " + (dayAllSeconds - currentAllSec));
  }
}
