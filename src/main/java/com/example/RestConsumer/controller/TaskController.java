package com.example.RestConsumer.controller;

import com.example.RestConsumer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public String findAll() {
        var test = taskService.findAll();
        System.out.println(test.get(0).getDescription());
        return null;
    }

}
