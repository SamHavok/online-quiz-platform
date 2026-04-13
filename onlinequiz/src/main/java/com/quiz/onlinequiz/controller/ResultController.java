package com.quiz.onlinequiz.controller;

import com.quiz.onlinequiz.model.Result;
import com.quiz.onlinequiz.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultRepository resultRepository;

    @GetMapping("/user/{userId}")
    public List<Result> getResults(@PathVariable Long userId) {
        return resultRepository.findByUserId(userId);
    }
}