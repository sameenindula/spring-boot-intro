package com.cmjd.demo.service;

import java.util.List;

import com.cmjd.demo.entity.Category;

public interface CategoryServies {
    Category save(Category catagory);
    List <Category> getCategory();
    Category getCategoryById(Long Id);
    Category updateCategory(Long Id , Long categoryId);
    void delteCategory(Long Id);
    Category updateCategory(Long categoryId, Long categoryId2);
}
