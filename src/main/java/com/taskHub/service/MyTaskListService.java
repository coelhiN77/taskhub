package com.taskHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskHub.entity.MyTaskList;
import com.taskHub.repository.MyTaskRepository;

@Service
public class MyTaskListService {

  @Autowired
  private MyTaskRepository mytask;

  public void saveMyTask(MyTaskList task) {
    mytask.save(task);
  }

  public List<MyTaskList> getAllMyTasks() {
    return mytask.findAll();
  }

  public void deleteById(int id) {
    mytask.deleteById(id);
  }
}
