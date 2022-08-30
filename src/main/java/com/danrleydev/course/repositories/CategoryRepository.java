package com.danrleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danrleydev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
