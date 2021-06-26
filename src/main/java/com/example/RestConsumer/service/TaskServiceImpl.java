package com.example.RestConsumer.service;

import com.example.RestConsumer.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${resource.tasks}")
    private String resource;

    @Value("${resource.tasks}/{id}")
    private String idResource;

    @Override
    public List<Task> findAll() {
        return Arrays.asList(Objects.requireNonNull(restTemplate.getForObject(resource, Task[].class)));
    }

    public Task update(Integer id, Task task) {
        return restTemplate.exchange(idResource, HttpMethod.PUT, new HttpEntity<>(task), Task.class, id).getBody();
    }
}
