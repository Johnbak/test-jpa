package com.example.hello.repository;

import com.example.hello.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<Task,Integer> {
//    Task findById(int id);
}
