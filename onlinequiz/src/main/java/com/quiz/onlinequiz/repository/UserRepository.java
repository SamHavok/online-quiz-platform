package com.quiz.onlinequiz.repository;

import com.quiz.onlinequiz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}