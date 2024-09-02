package com.cmjd.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmjd.demo.entity.Task;
import com.cmjd.demo.service.TaskService;


@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllList(){
        List<Task> tasksList=taskService.getTasks();
        return ResponseEntity.status(200).body(tasksList);
    }

    @PostMapping("/tasks")
    public ResponseEntity<String> createTask(@RequestBody Task task){
        
        if(task.getTaskName()==null || task.getTaskName()==""){
            return ResponseEntity.status(422).body("please enter valid task name");
        }

        if (task.getPriority() == 0){
            return  ResponseEntity.status(422).body("please enter valid numer");
        }
        taskService.saveTask(task);
        return  ResponseEntity.status(201).body("Task Add Sucessfull");
    }

    @GetMapping("/tasks/{taskId}")    //add a  path variable
    public ResponseEntity<Task>  getTaskId(@PathVariable Long taskId) {
        Task task = taskService.getTaskById(taskId);

        if (task == null){
            return ResponseEntity.status(404).body(null);
        }else{
            return ResponseEntity.status(200).body(task);
        }
    }
    @PutMapping("/tasks/{taskId}")
    public ResponseEntity<Task> updateTask(@PathVariable Long taskId, @RequestBody Task task) {
        Task updateTask=taskService.updateTask(taskId, task);
        if (updateTask == null){
            return ResponseEntity.status(404).body(null);
        }else{
            return ResponseEntity.status(200).body(updateTask);
        }
    }

    @DeleteMapping("tasks/{taskId}")
        public void deleteTask(@PathVariable Long taskId){
        taskService.deleteTask(taskId);

    
    }
}
