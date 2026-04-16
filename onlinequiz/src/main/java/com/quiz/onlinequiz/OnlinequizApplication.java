package com.quiz.onlinequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.quiz.onlinequiz.repository")
@EntityScan(basePackages = "com.quiz.onlinequiz.model")
public class OnlinequizApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinequizApplication.class, args);
    }
}