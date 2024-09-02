package com.cmjd.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cmjd.demo.entity.Task;
import com.cmjd.demo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long Id) {
        return taskRepository.findById(Id).orElse(null);
    }

    @Override
    public Task updateTask(Long Id, Task task) {
        Task existingTask=taskRepository.findById(Id).orElse(task);

        if (existingTask==null) {
            return null;
            
        }else{
           existingTask.setTaskName(task.getTaskName());
           existingTask.setPriority(task.getPriority());
           existingTask.setDueDate(task.getDueDate());
           return taskRepository.save(existingTask);

        }
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
    
    
}
