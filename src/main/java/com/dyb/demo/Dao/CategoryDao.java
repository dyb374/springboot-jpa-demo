package com.dyb.demo.Dao;

import com.dyb.demo.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    Category findById(int id);
    List<Category> findByName(String name);
    List<Category> findByNum11(Integer num);
}
