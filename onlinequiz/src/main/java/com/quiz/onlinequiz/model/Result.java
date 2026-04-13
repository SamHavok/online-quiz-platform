package com.quiz.onlinequiz.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    private Long userId;
    private Long quizId;

    private int score;
}