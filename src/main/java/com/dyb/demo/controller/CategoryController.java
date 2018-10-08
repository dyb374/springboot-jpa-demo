package com.dyb.demo.controller;


import com.dyb.demo.entity.Category;
import com.dyb.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = "/categories/{id}")
    public Category getById(@PathVariable() Integer id){
        Category category;
        category = categoryService.findCategoryById(id);

        return category;
    }

    @GetMapping(value = "/categories/name/{name}")
    public List<Category> getByName(@PathVariable() String name){
        List<Category> categories;
        categories = categoryService.findCategoriesByName(name);

        return categories;
    }

}
