package com.example.RestConsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private Integer id;
    private String description;
    private boolean completed;
    private Integer completionPercentage;
    public User user;
}
