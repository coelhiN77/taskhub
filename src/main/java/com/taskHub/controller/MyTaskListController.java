package com.taskHub.controller;

import com.taskHub.service.MyTaskListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTaskListController {

  @Autowired
  private MyTaskListService service;

  @RequestMapping("/deleteMyList/{id}")
  public String deleteMyList(@PathVariable("id") int id) {
    service.deleteById(id);
    return "redirect:/taskToday";
  }
}
