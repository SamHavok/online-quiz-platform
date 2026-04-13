package com.quiz.onlinequiz.repository;

import com.quiz.onlinequiz.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {

    List<Result> findByUserId(Long userId);
}