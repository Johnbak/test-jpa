package com.example.hello.controllers;

import com.example.hello.model.Task;
import com.example.hello.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoListController {
    @Autowired
    TodoListService todoListService;

    @GetMapping("/all")
    public @ResponseBody Iterable<Task> getAllTask(){
        return todoListService.getAllTask();
    }

    @GetMapping("/how/{id}")
    public String getTaskByIds(@PathVariable int id){
        return todoListService.getNameById(id);
    }

    @PostMapping("/add")
    public void saveTask(@RequestBody Task task){
        todoListService.saveTask(task);
    }

}
