package com.quiz.onlinequiz.dto;

import lombok.Data;

@Data
public class QuizResponse {
    private int totalQuestions;
    private int correctAnswers;
    private int score;
}