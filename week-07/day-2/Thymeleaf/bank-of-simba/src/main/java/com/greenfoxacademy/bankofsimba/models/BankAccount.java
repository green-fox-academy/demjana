package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private Boolean king;
  private String personality;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, String personality) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = false;
    this.personality = personality;
  }

  public BankAccount(String name, int balance, String animalType, Boolean isKing, String personality) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = isKing;
    this.personality = personality;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public Boolean getKing() {
    return king;
  }

  public void setKing(Boolean king) {
    this.king = king;
  }

  public String getPersonality() {
    return personality;
  }

  public void setPersonality(String personality) {
    this.personality = personality;
  }
}
