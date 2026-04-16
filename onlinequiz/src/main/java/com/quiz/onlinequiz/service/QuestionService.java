package com.quiz.onlinequiz.service;

import com.quiz.onlinequiz.model.Question;
import com.quiz.onlinequiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question addQuestion(@NonNull Question question) {
        Question savedQuestion = questionRepository.save(question);
        return Objects.requireNonNull(savedQuestion);
    }

    public List<Question> getQuestionsByQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}