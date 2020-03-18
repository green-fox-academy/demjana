public class CodingHours {
  public static void main(String[] args) {
    int a = 6; //CodingHoursPerDay
    int b = 17; //SemesterWeeks
    int c = 5; //WorkdaysPerWeek
    int d = 7; //DaysPerWeek
    int e = 52; //Average work hours weekly
    int f = 24; // Hours / Day
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    System.out.println(a * b * c);
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    //
    System.out.println(b * e);
    System.out.println(b * d * f);
    System.out.println(884. / 2856 * 100 + "%");
    //
    float g = 884f;
    float h = 2856f;
    System.out.println(g / h * 100 + "%");


  }
}
