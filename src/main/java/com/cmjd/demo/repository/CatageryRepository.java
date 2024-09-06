package com.cmjd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmjd.demo.entity.Catagory;


@Repository
public interface CatageryRepository extends JpaRepository <Catagory,Long> {
    
}
