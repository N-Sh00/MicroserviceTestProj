package com.example.questionService.controller;

import com.example.questionService.entity.Question;
import com.example.questionService.entity.QuestionWrapper;
import com.example.questionService.entity.Response;
import com.example.questionService.service.QuestionService;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuizQuestions(@RequestParam String category,
                                                          @RequestParam Integer number){
        return questionService.getQuizQuestions(category, number);
    }

    @PostMapping("getQ")
    public ResponseEntity<List<QuestionWrapper>> getQsFromId(@RequestBody List<Integer> qIds){
        return questionService.getQsFromId(qIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
    }

}