package com.cmjd.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private  Long id;
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private double price;
    
    private String description;

    @ManyToOne
    @JoinColumn(name="catagory_id")
    private Catagory catagory;
}
