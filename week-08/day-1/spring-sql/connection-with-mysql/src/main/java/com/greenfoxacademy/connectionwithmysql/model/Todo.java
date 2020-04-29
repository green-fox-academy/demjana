package com.greenfoxacademy.connectionwithmysql.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;
  private Date dateOfCreation;


  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    this.dateOfCreation = new Date();
  }

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(boolean urgent) {
    this.isUrgent = urgent;
  }

  public boolean isIsDone() {
    return isDone;
  }

  public void setIsDone(boolean done) {
    this.isDone = done;
  }

  public Date getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(Date dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }
}
