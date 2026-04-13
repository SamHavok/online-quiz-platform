package com.quiz.onlinequiz.controller;

import com.quiz.onlinequiz.dto.AnswerRequest;
import com.quiz.onlinequiz.dto.QuizResponse;
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

    // ADD QUESTION
    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    // GET QUESTIONS BY QUIZ
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestions(@PathVariable Long quizId) {
        return questionService.getQuestionsByQuiz(quizId);
    }

    // 🔥 SUBMIT QUIZ (FINAL)
    @PostMapping("/submit")
    public QuizResponse submitQuiz(
            @RequestParam Long userId,
            @RequestParam Long quizId,
            @RequestBody List<AnswerRequest> answers) {

        return questionService.calculateScore(userId, quizId, answers);
    }
}