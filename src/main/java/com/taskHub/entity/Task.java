package com.taskHub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String level;
  private String qtDay;
  public Task(int id, String title, String level, String qtDay) {
    super();
    this.id = id;
    this.title = title;
    this.level = level;
    this.qtDay = qtDay;
  }

  public Task() {
    super();
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  public String getQtDay() {
    return qtDay;
  }
  public void setQtDay(String qtDay) {
    this.qtDay = qtDay;
  }
}