package com.danrleydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danrleydev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
