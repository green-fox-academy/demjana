package cloneable;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.name + " a " + this.age + " year old " +
        this.gender + " from " + this.previousOrganization + " who " + this.skippedDays +
        " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays = numberOfDays;
  }

}
