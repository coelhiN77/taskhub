package com.taskHub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.taskHub.entity.Task;
import com.taskHub.entity.MyTaskList;
import com.taskHub.service.TaskService;
import com.taskHub.service.MyTaskListService;

import java.util.*;

@Controller
public class TaskController {

  @Autowired
  private TaskService service;

  @Autowired
  private MyTaskListService myTaskService;

  @GetMapping("/")
  public String home() {
    return "taskHome";
  }

  @GetMapping("/taskAdd")
  public String taskAdd() {
    return "taskAdd";
  }

  @GetMapping("/taskPanel")
  public ModelAndView getAllTask() {
    List<Task>list=service.getAllTask();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("taskPanel");
//		m.addObject("task",list);
    return new ModelAndView("taskPanel","task",list);
  }

  @PostMapping("/save")
  public String taskAdd(@ModelAttribute Task b) {
    service.save(b);
    return "redirect:/taskPanel";
  }

  @GetMapping("/taskToday")
  public String getMyTasks(Model model)
  {
    List<MyTaskList>list=myTaskService.getAllMyTasks();
    model.addAttribute("task",list);
    return "taskToday";
  }

  @RequestMapping("/selectTask/{id}")
  public String getMyList(@PathVariable("id") int id) {
    Task b=service.getTaskById(id);
    MyTaskList mb=new MyTaskList(b.getId(),b.getTitle(),b.getLevel(),b.getQtDay());
    myTaskService.saveMyTask(mb);
    return "redirect:/taskToday";
  }

  @RequestMapping("/editTask/{id}")
  public String editTask(@PathVariable("id") int id,Model model) {
    Task b=service.getTaskById(id);
    model.addAttribute("task",b);
    return "taskEdit";
  }

  @RequestMapping("/deleteTask/{id}")
  public String deleteTask(@PathVariable("id")int id){
    service.deleteById(id);
    return "redirect:/taskPanel";
  }
}
