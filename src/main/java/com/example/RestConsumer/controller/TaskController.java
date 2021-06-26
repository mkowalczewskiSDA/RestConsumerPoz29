package com.example.RestConsumer.controller;

import com.example.RestConsumer.model.Task;
import com.example.RestConsumer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("tasks", taskService.findAll());
        return "tasks";
    }

    @PostMapping("put")
    public String update(Task task) {
        System.out.println("test");
        taskService.update(task.getId(), task);
        return "redirect:/";
    }

}
