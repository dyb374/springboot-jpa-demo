package com.dyb.demo.service.impl;

import com.dyb.demo.repository.CategoryRepository;
import com.dyb.demo.entity.Category;
import com.dyb.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    @Cacheable(value = "category", key = "#id")
    public Category findCategoryById(int id) {
        Category category;
        category = categoryRepository.findById(id);

        return category;
    }

    @Override
    public List<Category> findCategoriesByName(String name) {
        List<Category> categories;
        categories = categoryRepository.findByName(name);

        return categories;
    }
}
