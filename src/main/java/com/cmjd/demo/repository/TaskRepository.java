package com.cmjd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmjd.demo.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
