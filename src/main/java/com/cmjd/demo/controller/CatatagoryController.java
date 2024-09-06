package com.cmjd.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmjd.demo.entity.Catagory;
import com.cmjd.demo.service.CatagoryServies;


@RestController
public class CatatagoryController {
    @Autowired
    private CatagoryServies catagoryServies;
    @GetMapping("/catagory")
    public ResponseEntity<List<Catagory>> getCatagories(){
        List<Catagory> catagories= catagoryServies.getAllCatagories();
        return ResponseEntity.status(200).body(catagories);
    }
    
    @PostMapping("/catagory")
    public ResponseEntity<Catagory> createCatagory(@RequestBody Catagory catagory) {
        Catagory createCatagory = catagoryServies.createCateCatagory(catagory);
        
        return ResponseEntity.status(201).body(createCatagory);
    }
    
}
