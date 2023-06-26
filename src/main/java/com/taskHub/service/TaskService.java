package com.taskHub.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskHub.entity.Task;
import com.taskHub.repository.TaskRepository;

@Service
public class TaskService {

  @Autowired
  private TaskRepository bRepo;

  public void save(Task b) {
    bRepo.save(b);
  }
  public List<Task> getAllTask() {
    return bRepo.findAll();
  }
  public Task getTaskById(int id) {
    return bRepo.findById(id).get();
  }
  public void deleteById(int id) {
    bRepo.deleteById(id);
  }
}
