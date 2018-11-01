package com.example.hello.service;

import com.example.hello.model.Task;

import java.util.List;

public interface TodoListService {
    public List<Task> getAllTask();

    public String getNameById(int teamId);

    public void saveTask(Task task);
}
