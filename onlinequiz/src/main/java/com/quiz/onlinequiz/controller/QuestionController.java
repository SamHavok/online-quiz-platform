package com.quiz.onlinequiz.controller;

import com.quiz.onlinequiz.model.Question;
import com.quiz.onlinequiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestions(@PathVariable Long quizId) {
        return questionService.getQuestionsByQuiz(quizId);
    }
}