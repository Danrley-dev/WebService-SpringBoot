package com.danrleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danrleydev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
