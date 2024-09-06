package com.cmjd.demo.service;

import java.util.List;

import com.cmjd.demo.entity.Catagory;


public interface CatagoryServies {
    List <Catagory> getAllCatagories();
    Catagory createCateCatagory(Catagory catagory);
    
}
