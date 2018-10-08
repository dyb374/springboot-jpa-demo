package com.dyb.demo.service;

import com.dyb.demo.entity.Category;

import java.util.List;

public interface CategoryService {

    Category findCategoryById(int id);
    List<Category> findCategoriesByName(String name);
}
