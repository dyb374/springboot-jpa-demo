package com.dyb.demo.Service.Impl;

import com.dyb.demo.Dao.CategoryDao;
import com.dyb.demo.Entity.Category;
import com.dyb.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    @Cacheable(value = "category", key = "#id")
    public Category findCategoryById(int id) {
        Category category;
        category = categoryDao.findById(id);

        return category;
    }

    @Override
    public List<Category> findCategoriesByName(String name) {
        List<Category> categories;
        categories = categoryDao.findByName(name);

        return categories;
    }
}
