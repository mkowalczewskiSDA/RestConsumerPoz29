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

    //tutaj przyjmujemy operacje typu post - ponieważ to jest kontroller widoku
    //przeglądarki a przeglądarka może generować tylko requesty http typu
    //get i post - natomiast z konsoli, lub za pomocą RestTemplate możemy także
    //dokonywać też operacji put, delete
    @PostMapping("put")
    public String update(Task task) {
        System.out.println("test");
        taskService.update(task.getId(), task);
        return "redirect:/";
    }

}
