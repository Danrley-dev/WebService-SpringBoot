package com.danrleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danrleydev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
