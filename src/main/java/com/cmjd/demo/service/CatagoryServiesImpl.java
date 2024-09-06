package com.cmjd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmjd.demo.entity.Catagory;
import com.cmjd.demo.repository.CatageryRepository;

@Service
public class CatagoryServiesImpl implements CatagoryServies {
@Autowired
private CatageryRepository catageryRepository;

@Override
public List<Catagory> getAllCatagories() {
    return catageryRepository.findAll();
}

@Override
public Catagory createCateCatagory(Catagory catagory) {
    return catageryRepository.save(catagory);
}
}
