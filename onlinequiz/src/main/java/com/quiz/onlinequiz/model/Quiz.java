package com.quiz.onlinequiz.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;

    private String quizTitle;
    private int totalMarks;
}