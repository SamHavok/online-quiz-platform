package com.quiz.onlinequiz.service;

import com.quiz.onlinequiz.dto.AnswerRequest;
import com.quiz.onlinequiz.dto.QuizResponse;
import com.quiz.onlinequiz.model.Question;
import com.quiz.onlinequiz.model.Result;
import com.quiz.onlinequiz.repository.QuestionRepository;
import com.quiz.onlinequiz.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ResultRepository resultRepository;

    // ADD QUESTION
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    // GET QUESTIONS BY QUIZ
    public List<Question> getQuestionsByQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }

    // 🔥 FINAL QUIZ EVALUATION + RESULT STORAGE
    public QuizResponse calculateScore(Long userId, Long quizId, List<AnswerRequest> answers) {

        int correct = 0;

        for (AnswerRequest ans : answers) {

            Question question = questionRepository.findById(ans.getQuestionId())
                    .orElse(null);

            if (question != null &&
                    question.getCorrectAnswer() != null &&
                    question.getCorrectAnswer().equalsIgnoreCase(ans.getSelectedAnswer())) {
                correct++;
            }
        }

        // SAVE RESULT
        Result result = new Result();
        result.setUserId(userId);
        result.setQuizId(quizId);
        result.setScore(correct);

        resultRepository.save(result);

        // RESPONSE
        QuizResponse response = new QuizResponse();
        response.setTotalQuestions(answers.size());
        response.setCorrectAnswers(correct);
        response.setScore(correct);

        return response;
    }
}