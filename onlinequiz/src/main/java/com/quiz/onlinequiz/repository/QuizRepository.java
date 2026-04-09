package com.quiz.onlinequiz.repository;

import com.quiz.onlinequiz.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
