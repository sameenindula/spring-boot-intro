package com.cmjd.demo.service;

import java.util.List;

import com.cmjd.demo.entity.Task;

public interface TaskService {
    Task saveTask(Task task);
    List<Task> getTasks();
    Task getTaskById(Long Id);
    Task updateTask(Long Id,Task task);
    void deleteTask(Long id);
}
