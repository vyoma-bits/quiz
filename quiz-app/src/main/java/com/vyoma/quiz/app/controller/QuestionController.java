package com.vyoma.quiz.app.controller;

import com.vyoma.quiz.app.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
    QuestionService questionservice;
    @GetMapping("allQuestions")
    public String getAllQuestions(){
return questionService.getAllQuestions();
    }
    @GetMapping("hello")
    public String hello(){
        return "FUCK";
    }
}
