package com.dyb.demo.repository;

import com.dyb.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findById(int id);
    List<Category> findByName(String name);
    List<Category> findByNum(Integer num);
}
