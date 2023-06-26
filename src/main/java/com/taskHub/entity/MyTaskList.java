package com.taskHub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyTasks")
public class MyTaskList {

  @Id
  private int id;
  private String title;
  private String level;
  private String qtDay;
  public MyTaskList() {
    super();
  }

  public MyTaskList(int id, String title, String level, String qtDay) {
    super();
    this.id = id;
    this.title = title;
    this.level = level;
    this.qtDay = qtDay;
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