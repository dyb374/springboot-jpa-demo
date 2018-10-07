package com.dyb.demo.Service;

import com.dyb.demo.Entity.Category;

import java.util.List;

public interface CategoryService {

    Category findCategoryById(int id);
    List<Category> findCategoriesByName(String name);
}
