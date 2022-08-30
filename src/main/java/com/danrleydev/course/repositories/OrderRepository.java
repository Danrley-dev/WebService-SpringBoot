package com.danrleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danrleydev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
