package com.greenfoxacademy.frontend.model;

public class Greeter {
  private String name;
  private String title;
  private String welcome_message;

  public Greeter() {
  }

  public Greeter(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcome_message = "Oh, hi there " + this.name + ", my dear " + this.title + "!";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
