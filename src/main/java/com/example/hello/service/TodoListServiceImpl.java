package com.example.hello.service;


import com.example.hello.model.Task;
import com.example.hello.repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService{
    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public List<Task> getAllTask() {
        return todoListRepository.findAll();
    }

    @Override
    public String getNameById(int teamId) {
        Integer intObj = new Integer(teamId);
        Task task =todoListRepository.getOne(intObj);
        return task.getTaskName();
    }

    @Override
    public void saveTask(Task task) {
//        task.setId(2);
        todoListRepository.save(task);
    }
}
