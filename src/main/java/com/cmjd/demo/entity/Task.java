package com.cmjd.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private  Long id;
    @Column(nullable = false)
    private String taskName;
    
    @Column(nullable = false)
    private int priority;
    
    private LocalDateTime dueDate;

    
    
}
