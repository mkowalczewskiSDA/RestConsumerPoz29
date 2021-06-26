package com.example.RestConsumer.service;

import com.example.RestConsumer.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task update(Integer id, Task task);

}
